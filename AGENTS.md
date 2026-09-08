# Hodor 后端工程

## 项目概述

Hodor 是一个基于 Spring Boot 的多模块 Java 后端工程，使用 Gradle 构建。项目包含微信公众号/支付集成、MySQL 数据访问、Redis 缓存、七牛云存储、通义千问 AI 问答等能力。

- **Group**: `com.codido`
- **Version**: `1.0-SNAPSHOT`
- **Java**: 17
- **Spring Boot**: 2.7.18
- **Gradle**: 8.14.2

## 项目架构图

```mermaid
graph TB
    subgraph 外部请求
        Client["客户端<br/>(小程序 / APP / H5)"]
        WxMp["微信公众号"]
    end

    subgraph Hodor-cgi["Hodor-cgi — API 服务 (Jetty :8848)"]
        direction TB
        subgraph CGI-Controller["Controller 层"]
            UserCtrl["UserController<br/>/usr/**"]
            OrdCtrl["OrdController<br/>/order/**"]
        end
        subgraph CGI-AOP["AOP 切面"]
            LoginAspect["LoginAspect<br/>@AreYouLogin 登录校验"]
            LogAspect["RequestLogAspect<br/>请求日志"]
        end
        subgraph CGI-Service["Service 层"]
            UserSvc["UserServiceImpl"]
        end
        subgraph CGI-Weixin["微信集成"]
            WxHandler["Message Handler<br/>(Log/Null/Abstract)"]
            WxConfig["WxConfig<br/>WxPayConfiguration"]
            WxBuilder["Message Builder<br/>(Text/Image)"]
        end
        subgraph CGI-Common["公共组件"]
            ChatQA["ChatQAUtil<br/>通义千问问答"]
            SmsUtil["ChuangLanSmsUtil<br/>短信发送"]
            DruidCfg["DruidDBConfig<br/>数据库连接池"]
            EvnCfg["EvnConfig<br/>环境配置"]
        end
        HodorApiApp["HodorApiApplication<br/>@SpringBootApplication"]
    end

    subgraph Hodor-core["Hodor-core — 公共逻辑 + DAO 层"]
        direction TB
        subgraph Core-Mapper["MyBatis Mapper 层"]
            Mapper["Mapper 接口<br/>(ANNOTATEDMAPPER)"]
            SqlProvider["SqlProvider<br/>(SQL 提供类)"]
        end
        subgraph Core-Model["Model 层"]
            Model["Model / Example<br/>(ORM 对象)"]
        end
        subgraph Core-BO["BO 层"]
            RedisBO["RedisUtilBo"]
            MpBO["SendMpMessageBo"]
            CfgBO["CfgBo / CfgBoImpl"]
        end
        subgraph Core-Util["工具类"]
            DateUtil["JBDateUtil"]
            MD5["MD5Util"]
            AES["AesCbcUtil"]
            HttpUtil["HttpClientUtil"]
            PicUtil["PictureUtil"]
        end
        subgraph Core-Common["公共 DTO / 常量"]
            BaseDto["BaseDto / BaseRetDto"]
            Constans["CommonConstans"]
        end
    end

    subgraph Hodor-job["Hodor-job — 定时任务"]
        direction TB
        SubInt["SubIntScheduling<br/>@Scheduled cron 任务"]
        SendMsgSvc["SendMessageService"]
        JobApp["JobApplication<br/>@EnableScheduling"]
    end

    subgraph 基础设施
        MySQL[("MySQL<br/>Druid 连接池")]
        Redis[("Redis 缓存")]
    end

    subgraph 外部服务
        QwenAI["通义千问 AI<br/>(DashScope)"]
        Qiniu["七牛云存储"]
        WxAPI["微信 MP / Pay API"]
        SmsGW["创蓝短信网关"]
    end

    %% 模块依赖
    Hodor-cgi --> Hodor-core
    Hodor-job --> Hodor-core

    %% 请求入口
    Client -->|HTTP 请求| CGI-Controller
    WxMp -->|消息回调| CGI-Weixin

    %% CGI 内部调用
    CGI-Controller --> CGI-AOP
    CGI-AOP --> CGI-Service
    CGI-Service --> Core-BO
    CGI-Service --> Core-Mapper
    CGI-Weixin --> Core-BO
    CGI-Common --> QwenAI
    CGI-Common --> SmsGW

    %% Core 内部调用
    Core-BO --> Core-Mapper
    Core-Mapper --> Core-Model
    Core-Mapper --> MySQL
    Core-BO --> Redis

    %% Job 内部调用
    Hodor-job --> Core-Mapper
    Hodor-job --> Core-BO

    %% 外部服务连接
    CGI-Weixin --> WxAPI
    Core-Util --> Qiniu

    %% 样式
    style Hodor-cgi fill:#E3F2FD,stroke:#1976D2,stroke-width:2px
    style Hodor-core fill:#E8F5E9,stroke:#388E3C,stroke-width:2px
    style Hodor-job fill:#FFF3E0,stroke:#F57C00,stroke-width:2px
    style MySQL fill:#FFEBEE,stroke:#C62828
    style Redis fill:#FFEBEE,stroke:#C62828
    style QwenAI fill:#F3E5F5,stroke:#7B1FA2
    style Qiniu fill:#F3E5F5,stroke:#7B1FA2
    style WxAPI fill:#F3E5F5,stroke:#7B1FA2
    style SmsGW fill:#F3E5F5,stroke:#7B1FA2
```

### 模块依赖关系

- `Hodor-cgi` → 依赖 `Hodor-core`
- `Hodor-job` → 依赖 `Hodor-core`
- `Hodor-core` → 独立，被其他两个模块引用

### 请求调用链路

```mermaid
graph LR
    A["客户端请求"] --> B["Controller<br/>(Req 入参)"]
    B --> C["LoginAspect<br/>@AreYouLogin"]
    C --> D["Service<br/>(业务逻辑)"]
    D --> E["BO<br/>(公共业务)"]
    D --> F["Mapper<br/>(数据访问)"]
    E --> F
    F --> G[("MySQL")]
    E --> H[("Redis")]
    D --> I["Resp 响应"]
    I --> J["客户端"]
```

## 构建与运行

```bash
# 构建整个项目
./gradlew build

# 运行 API 服务（Hodor-cgi，端口 8848）
./gradlew :Hodor-cgi:bootRun

# 运行定时任务（Hodor-job）
./gradlew :Hodor-job:bootRun

# 重新生成 MyBatis Mapper（在 Hodor-core 目录下）
./gradlew :Hodor-core:mybatisGenerate
```

## 技术栈

| 领域 | 技术 |
|------|------|
| 框架 | Spring Boot 2.7.18 |
| Web 容器 | Jetty（排除了 Tomcat） |
| 数据库 | MySQL + Druid 连接池 |
| ORM | MyBatis + MyBatis Generator + PageHelper 分页 |
| 缓存 | Redis (spring-boot-starter-data-redis) |
| 日志 | Logback |
| 接口文档 | Swagger (springfox 3.0.0) + swagger-bootstrap-ui |
| 微信 | weixin-java-mp 3.7.0, weixin-java-pay 3.7.0 |
| AI | 通义千问 (dashscope-sdk-java) |
| 云存储 | 七牛云 SDK |
| JSON | fastjson + gson |
| 工具 | Lombok, commons-lang3, httpclient |

## 代码规范与约定

### 分层架构

```
Controller → Service(Impl) → BO(Business Object) → Mapper → Model
```

- **Controller**: 对外 REST 接口，入参为 `req` 对象，返回 `resp` 对象
- **Service**: 业务逻辑处理，接口 + Impl 实现
- **BO**: 公共业务逻辑（如发微信推送、短信），跨 Service 复用
- **Mapper**: MyBatis 数据访问接口，由 MyBatis Generator 生成
- **Model**: 数据库表对应的 ORM 对象，由 MyBatis Generator 生成

### Bean 命名约定

| 后缀 | 用途 | 说明 |
|------|------|------|
| `Req` | Controller 入参 | 继承 `BaseReq`，含 Swagger 注解 |
| `Resp` | Controller 返回 | 继承 `BaseResp`，含 `respCode`/`respMsg` |
| `Dto` | Service/BO 层参数与返回值 | 业务逻辑处理 |
| `Vo` | 请求/响应中的业务对象 | JSON 序列化 |
| `Po` | 自定义 MyBatis 查询结果映射 | 对应自定义 SQL 结果集 |
| `Example` | MyBatis ORM 查询条件 | 自动生成，通常不修改 |
| `SqlProvider` | MyBatis SQL 提供类 | 自动生成，通常不修改 |

### 通用约定

- 所有请求对象继承 `BaseReq`（含 `tokenId`、`channelFlag`、`versionNumber`）
- 所有响应对象继承 `BaseResp`（含 `respCode`/`respMsg`，`0000` 表示成功）
- 使用 Lombok `@Data` 生成 getter/setter/toString
- 使用 Swagger 注解生成接口文档
- 登录校验通过自定义注解 `@AreYouLogin` + AOP `LoginAspect` 实现
- 包结构根包为 `com.codido.hodor.{module}.{domain}.{layer}`

## 配置文件

- 主配置: `application.yml` → 通过 `spring.profiles.active` 切换环境
- 环境配置: `application-dev.yml` / `application-uat.yml` / `application-ptc.yml`
- 日志配置: `logback-spring.xml`
- MyBatis Generator 配置: `Hodor-core/src/main/resources/tools/HodorGeneratorConfig.xml`

## 关键入口

- API 服务启动类: `Hodor-cgi/src/main/java/com/codido/hodor/api/HodorApiApplication.java`（端口 8848）
- 定时任务启动类: `Hodor-job/src/main/java/com/codido/hodor/job/JobApplication.java`
- Mapper 扫描路径: `com.codido.hodor.core.mapper`

## 注意事项

- `Hodor-core` 的 `bootJar` 已禁用，仅打普通 JAR 供其他模块依赖
- 项目使用 Jetty 而非 Tomcat 作为内嵌 Web 容器
- MyBatis Generator 使用 `ANNOTATEDMAPPER` 模式（注解 SQL，无 XML mapper 文件）
- 配置文件中的数据库地址、密钥等敏感信息为占位符，部署时需替换

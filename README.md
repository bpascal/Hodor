## Hodor后端工程

#### 0.技术栈

    整体框架:spring boot 
    数据库连接池:Druid 
    DAO层:MyBatis 
    缓存:redis 
    日志:logback 
    接口文档:swagger2生成

#### 1.概念介绍
1. DAO:数据库访问对象，访问数据库需要用到的一些对象
2. BO:业务功能对象，用于处理公共业务逻辑方法，如发短信、发微信推送消息等
3. SERVICE:服务层对象，用于每个服务端工程特有的业务逻辑处理
4. Controller:访问层对象，对外提供rest接口给前端项目调用
5. mapper:DAO层定义具体sql和数据库操作的方法，通过MybatisGenerator自动生成，可自行修改
6. Example:Mybatis的ORM对象，可用于生成数据库访问sql方法，通过MybatisGenerator自动生成，通常不进行修改
7. SqlProvider:Mybatis的ORM对象处理方法，用于数据库访问sql操作，通过MybatisGenerator自动生成，通常不进行修改
8. model:Mybatis根据表结构生成的ORM对象，每个对象与一张表对应，每个属性与数据库表结构的字段一一对应，通过MybatisGenerator自动生成，通常不进行修改
9. Po:自定义的Mybatis的ORM操作对象，每个对象与一个或多个sql查询语句的结果集对应，属性与查询的字段一一对应，根据业务逻辑需要由开发人员定义及修改，使用lombak注解生成getter和setter方法及toString方法
10. Dto:service方法和BO方法的参数和返回对象，用于业务逻辑处理，使用lombak注解生成getter和setter方法及toString方法
11. req:请求对象，作为controller方法的入参，严格按照json格式要求编写，使用lombak注解生成getter和setter方法及toString方法，使用swagger注解生成接口文档
12. resq:响应对象，作为controller方法的返回，严格按照json格式要求编写，使用lombak注解生成getter和setter方法及toString方法，使用swagger注解生成接口文档
13. vo:请求/响应对象中使用的业务对象，严格按照json格式要求编写，使用lombak注解生成getter和setter方法及toString方法，使用swagger注解生成接口文档

#### 1.工程目录介绍

1. Hodor-core工程：包含公共后端逻辑和DAO层的Mybatis代码
2. Hodor-cgi工程：包含具体业务接口的service和controller逻辑
3. Hodor-job工程：轮训业务工程，包含轮训需要操作的一些类和方法


#### 2.开发规范



#### 3.参考资料

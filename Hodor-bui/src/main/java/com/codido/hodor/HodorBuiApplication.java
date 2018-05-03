package com.codido.hodor;


import org.beetl.core.GroupTemplate;
import org.beetl.core.resource.ClasspathResourceLoader;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
import org.beetl.ext.spring.BeetlSpringViewResolver;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;

@SpringBootApplication
@Configuration
@MapperScan("com.codido.hodor.mapper")
public class HodorBuiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(HodorBuiApplication.class, args);
	}

	@Bean(initMethod = "init", name = "beetlConfig")
	public BeetlGroupUtilConfiguration getBeetlGroupUtilConfiguration() {
		BeetlGroupUtilConfiguration beetlGroupUtilConfiguration = new BeetlGroupUtilConfiguration();
		//获取Spring Boot 的ClassLoader
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		if(loader==null){
			loader = SpringBootApplication.class.getClassLoader();
		}
		try {
			beetlGroupUtilConfiguration.setConfigProperties(PropertiesLoaderUtils.loadAllProperties("beetl.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		ClasspathResourceLoader cploder = new ClasspathResourceLoader(loader,"templates/");
		beetlGroupUtilConfiguration.setResourceLoader(cploder);
		beetlGroupUtilConfiguration.init();
		//如果使用了优化编译器，涉及到字节码操作，需要添加ClassLoader
		GroupTemplate groupTemplate = beetlGroupUtilConfiguration.getGroupTemplate();
		groupTemplate.setClassLoader(loader);
		return beetlGroupUtilConfiguration;
	}

	@Bean(name = "beetlViewResolver")
	public BeetlSpringViewResolver getBeetlSpringViewResolver(@Qualifier("beetlConfig") BeetlGroupUtilConfiguration beetlGroupUtilConfiguration) {
		BeetlSpringViewResolver beetlSpringViewResolver = new BeetlSpringViewResolver();
		beetlSpringViewResolver.setContentType("text/html;charset=UTF-8");
		beetlSpringViewResolver.setOrder(0);
		beetlSpringViewResolver.setConfig(beetlGroupUtilConfiguration);
		return beetlSpringViewResolver;
	}
}

package com.example.springboot_exec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/*
 * @SpringBootApplication:相当于：@SpringBootConfiguration  相当于@Configuration
 * 
								  @EnableAutoConfiguration  
								  		@AutoConfigurationPackage  将指定的包下的所有组件注册到spring
								  			@Import(AutoConfigurationPackages.Registrar.class)
										@Import(AutoConfigurationImportSelector.class)  写死了(spring.factories)容器启动时需要加载的配置类，
																						但springboot会对他们进行按需开启(装配)（通过@Conditional相关子类）

								  @ComponentScan  指定扫描哪些包
 */
@SpringBootApplication
public class SpringbootExecApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringbootExecApplication.class, args);
	}

}

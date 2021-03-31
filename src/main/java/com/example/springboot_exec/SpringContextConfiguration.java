package com.example.springboot_exec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.springboot_exec.pojo.Car;
import com.example.springboot_exec.pojo.User;

/*
 * 相当于spring的xml配置文件
 * 通过@Configuration告诉spring这是一个配置类
 * 
 * 可以通过@ImportResource("xmlpath")注解导入spring配置文件（不推荐）
 */
/*
 * proxyBeanMethods = true(default) 是否代理该类，如果代理该类，在获取bean时，代理会检查该bean是否已经被创建，如果被创建，返回该bean。
 * 							优点：可以返回单实例对象
 * 							缺点：启动慢
 * 					  false：不对该类进行代理，它比被代理的配置类启动更快
 */
@Configuration(proxyBeanMethods = true)
/*
 * 通过@Import添加组件
 * @Import(class)
 * 或者
 * @Import({class1, class2})
 * */
@Import(Car.class)
public class SpringContextConfiguration {
	/*
	 * 如何配置：
	 * @Bean("也可以在这里配置beanId")
	 * public ClassType BeanId1(Bean bean) {  //springboot会给bean寻找与之相同类的bean进行配对
	 * 		return new Bean(BeanId2()这里相当于引用);
	 * }
	 */
	@Bean("root")
	public User root() {
		return new User("root", "root@123.com", "123456");
	}
	
	/*
	 * @Conditional条件装配，顾名思义就是当符合条件时才注册被注解的组件
	 */
	
	/*
	 * 配置绑定：
	 * 		@ConfigurationProperties：
	 * 			
	 */
	
}

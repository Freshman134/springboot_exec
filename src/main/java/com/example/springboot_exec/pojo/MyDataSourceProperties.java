package com.example.springboot_exec.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/*
 * 配置绑定：
 * 		1. 在被绑定的类@ConfigurationProperties：
 * 			prefix: 前缀   寻找prefix.propertyName=value格式
 * 		2. 标记为spring组件
 * 				或者
 * 				在配置类上添加上@EnableConfigurationProperties(Class) 或者 @EnableConfigurationProperties({Class1, Class2})
 * 				@EnableConfigurationProperties可以自动为Class绑定属性，并自动注入到容器里面
 */
@Component
@ConfigurationProperties(prefix = "db")
public class MyDataSourceProperties {
	private String username;
	private String password;
	private String url;
	private String driverClassName;
	
	public MyDataSourceProperties() {}
	public MyDataSourceProperties(String username, String password, String url, String driverClassName) {
		this.username = username;
		this.password = password;
		this.url = url;
		this.driverClassName = driverClassName;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getDriverClassName() {
		return driverClassName;
	}
	
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	
	@Override
	public String toString() {
		return "DataSourceProperties [username=" + username + ", password=" + password + ", url=" + url
				+ ", driverClassName=" + driverClassName + "]";
	}
}

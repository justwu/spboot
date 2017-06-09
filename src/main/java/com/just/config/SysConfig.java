package com.just.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by flyhigh on 2017/6/9.
 */
@Configuration
@EnableAspectJAutoProxy   //扫描注册拦截器代理
@ComponentScan("com.just")  //如果扫描到有@Component @Controller @Service等这些注解的类，则把这些类注册为bean
public class SysConfig {


}

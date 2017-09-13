package com.just.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by flyhigh on 2017/6/9.
 */
@Configuration
@EnableAspectJAutoProxy   //扫描注册拦截器代理
@ComponentScan("com.just")  //如果扫描到有@Component @Controller @Service等这些注解的类，则把这些类注册为bean
@EnableAsync
@EnableWebMvc
@EnableCaching
public class SysConfig extends WebMvcConfigurerAdapter {



   /* @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public FilterRegistrationBean filterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(openSessionInView());
        registration.addUrlPatterns("/*");

        return registration;
    }

    @Bean
    public Filter openSessionInView() {
        return new OpenSessionInViewFilter();
    }*/
}

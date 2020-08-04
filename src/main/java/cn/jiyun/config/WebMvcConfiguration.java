package cn.jiyun.config;

import cn.jiyun.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/*
*配置拦截器
* 1.声明该类是一个java配置类
* 2.实现WebMvcConfigurer接口
* 3.重写addInterceptors方法
*
* */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {


    @Autowired
    private MyInterceptor myInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
         registry.addInterceptor(myInterceptor).addPathPatterns("/**");


    }
}

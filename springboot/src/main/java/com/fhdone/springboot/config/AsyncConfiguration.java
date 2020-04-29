package com.fhdone.springboot.config;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;


/**
 *自定义ExceptionHandler配置
 */
@Configuration
@EnableAsync
public class AsyncConfiguration extends AsyncConfigurerSupport {

    @Override
    public Executor getAsyncExecutor() {
        return new SimpleAsyncTaskExecutor();
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        //lambda表达式用作异常处理程序
        return (throwable, method, obj)->{
            System.out.println("Exception Caught in Thread - " +         Thread.currentThread().getName());
            System.out.println("Exception message - " + throwable.getMessage());
            System.out.println("Method name - " + method.getName());
            for (Object param : obj) {
                System.out.println("Parameter value - " + param);
            }
        };
    }

}

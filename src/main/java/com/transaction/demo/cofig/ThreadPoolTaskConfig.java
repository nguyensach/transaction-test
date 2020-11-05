package com.transaction.demo.cofig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Slf4j
@Configuration
public class ThreadPoolTaskConfig implements AsyncConfigurer {

  public static final String TEST_THREAD_POOL = "test_thread_pool";

  @Override
  @Bean(TEST_THREAD_POOL)
  @Qualifier(TEST_THREAD_POOL)
  public Executor getAsyncExecutor() {
    ThreadPoolTaskExecutor threadPool = new ThreadPoolTaskExecutor();
    threadPool.setCorePoolSize(10);
    threadPool.setMaxPoolSize(10);
    
    return threadPool;
  }

//  @Override
//  public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
//    return (exception, method, params) -> log
//        .error(String.format("Exception in %s", method), exception);
//  }
}

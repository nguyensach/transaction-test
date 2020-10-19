package com.transaction.demo;

import com.transaction.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.CompletableFuture;

@SpringBootApplication
@EnableAsync
@Slf4j
public class DemoApplication {

  public static void main(String[] args) {
    log.info("Start application");
    ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
    UserService service = applicationContext.getBean(UserService.class);

    CompletableFuture<Void>[] results = new CompletableFuture[20];

    for (var i = 1; i < 21; i++)
      results[i - 1] = service.test(String.valueOf(i));

    CompletableFuture.allOf(results).join();
    log.info("End application");
  }
}

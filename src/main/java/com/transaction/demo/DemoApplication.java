package com.transaction.demo;

import com.transaction.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.CompletableFuture;

@SpringBootApplication
@EnableAsync
@Slf4j
public class DemoApplication {

  public static void main(String[] args) {
    try(ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args)) {
      log.info("Start application");
      UserService service = applicationContext.getBean(UserService.class);

      CompletableFuture<Void>[] results = new CompletableFuture[20];

      for (var i = 1; i < 21; i++)
        results[i - 1] = service.test(String.valueOf(i));

      CompletableFuture<Void> failure = new CompletableFuture();
      for (CompletableFuture<Void> f: results) {
        f.exceptionally(ex -> {
          failure.completeExceptionally(ex);
          return null;
        });
      }

      try {
        CompletableFuture.anyOf(failure, CompletableFuture.allOf(results)).join();
      } catch(Exception e) {
        log.error("exception in main thread {}", e);
      }

      log.info("End application");
    }
  }
}

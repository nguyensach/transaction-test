package com.transaction.demo;

import com.transaction.demo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class DemoApplication {

  public static void main(String[] args) {
    ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
    UserService service = applicationContext.getBean(UserService.class);
    for (var i = 1; i < 10; i++)
      service.test(String.valueOf(i));
  }
}

package com.transaction.demo.service;

import com.transaction.demo.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

import static com.transaction.demo.cofig.ThreadPoolTaskConfig.TEST_THREAD_POOL;

@Service
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Slf4j
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Override
  @Async(TEST_THREAD_POOL)
  public CompletableFuture<Void> test(String name) {
    log.info("start insert {}, in {}", name, Thread.currentThread().getName());
    userRepository.insert(name);

    log.info("end insert {}, in {}", name, Thread.currentThread().getName());
    return CompletableFuture.completedFuture(null);
  }
}

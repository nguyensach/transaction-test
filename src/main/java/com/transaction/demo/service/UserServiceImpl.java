package com.transaction.demo.service;

import com.transaction.demo.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Slf4j
public class UserServiceImpl implements UserService {

  @Autowired
  private final UserRepository userRepository;


  @Override
  @Async
  public CompletableFuture<Void> test(String name) {
    log.info("start insert {}, in {}", name, Thread.currentThread().getName());
    userRepository.insert(name);
    log.info("end insert {}, in {}", name, Thread.currentThread().getName());
    return CompletableFuture.completedFuture(null);
  }
}

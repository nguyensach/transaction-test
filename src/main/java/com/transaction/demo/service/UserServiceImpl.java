package com.transaction.demo.service;

import com.transaction.demo.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class UserServiceImpl implements UserService {

  @Autowired
  private final UserRepository userRepository;


  @Override
  @Async
  public void test(String name) {
    userRepository.insert(name);
  }
}

package com.transaction.demo.service;

import java.util.concurrent.CompletableFuture;

public interface UserService {
  CompletableFuture<Void> test(String name);
}

package com.transaction.demo.repository;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.jdbc.datasource.ConnectionHolder;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.lang.reflect.Field;

import static com.transaction.demo.db.transaction.Tables.USER;

@Repository
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class UserRepositoryImpl implements UserRepository {

  private final DSLContext context;

  @Override
  @Transactional
  public void insert(String name) {
    System.out.println("Current thread: " + Thread.currentThread().getName());
    for (var i = 0; i < 2; i++) {
      try {
        Thread.sleep(1_000);
        var transactionProvider = context.configuration().transactionProvider();
        Field f = transactionProvider.getClass().getDeclaredField("transactionManager");
        f.setAccessible(true);
        DataSourceTransactionManager transactionManager = (DataSourceTransactionManager) f.get(transactionProvider);
        var connection = ((ConnectionHolder) TransactionSynchronizationManager.getResource(transactionManager.getDataSource())).getConnection();
        System.out.println("Connection: " + connection + " in: " + Thread.currentThread().getName());
        context.insertInto(USER).set(USER.NAME, name + i).execute();
      } catch (NoSuchFieldException e) {
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

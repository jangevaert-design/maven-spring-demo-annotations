package edu.cnm.deepdive.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService{

  @Override
  public String getFortune() {
    return "This is the database.";
  }
}

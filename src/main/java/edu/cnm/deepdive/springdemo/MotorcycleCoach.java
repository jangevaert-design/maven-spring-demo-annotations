package edu.cnm.deepdive.springdemo;

import org.springframework.stereotype.Component;

@Component
public class MotorcycleCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Do some wheelies";
  }
}

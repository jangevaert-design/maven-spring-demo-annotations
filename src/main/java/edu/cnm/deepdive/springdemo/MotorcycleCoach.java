package edu.cnm.deepdive.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MotorcycleCoach implements Coach {

  private FortuneService fortuneService;

  @Autowired
  public MotorcycleCoach(FortuneService theFortuneService) {
    this.fortuneService = theFortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Do some wheelies";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
}

package edu.cnm.deepdive.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MotorcycleCoach implements Coach {

  @Autowired
  @Qualifier("databaseFortuneService")
  private FortuneService fortuneService;

  @Autowired
  public MotorcycleCoach(@Qualifier("databaseFortuneService") FortuneService theFortuneService) {
    this.fortuneService = theFortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "\nDo some wheelies";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }


}

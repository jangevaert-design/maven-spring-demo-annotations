package edu.cnm.deepdive.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

  @Autowired
  @Qualifier("randomFortuneService")
  private FortuneService fortuneService;

  public TennisCoach() {
    System.out.println("TennisCoach: inside default constructor.");
  }

//  @Autowired
//  public void doSomeCrazyStuff(FortuneService fortuneService) {
//    System.out.println("\nTennisCoach: inside doSomeCrazyStuff method.");
//    this.fortuneService = fortuneService;
//  }


  //  @Autowired
//  public TennisCoach(FortuneService theFortuneService) {
//    this.fortuneService = theFortuneService;
//  }



  @Override
  public String getDailyWorkout() {
    return "\nPractice your backhand volley.";

  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
}

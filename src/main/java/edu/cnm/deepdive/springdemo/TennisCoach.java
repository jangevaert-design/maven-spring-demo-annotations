package edu.cnm.deepdive.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

  @Autowired
  @Qualifier("randomFortuneService")
  private FortuneService fortuneService;

  public TennisCoach() {
    System.out.println("\nTennisCoach: inside default constructor.");
  }

  //define my init method
  @PostConstruct
  public void doMyStartupStuff() {
    System.out.println("\nTennisCoach: inside my doMyStartupStuff()");
  }
  //define my destroy method
  @PreDestroy
  public void doMyCleanupStuff() {
    System.out.println("\nTennisCoach: inside my doMyCleanupStuff()");
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

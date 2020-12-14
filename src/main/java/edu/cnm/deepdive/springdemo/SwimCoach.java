package edu.cnm.deepdive.springdemo;

public class SwimCoach implements Coach {

  private FortuneService fortuneService;

  public SwimCoach(FortuneService theFortuneService) {
    this.fortuneService = theFortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Swim 1,000 meters as a warm up.";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
}

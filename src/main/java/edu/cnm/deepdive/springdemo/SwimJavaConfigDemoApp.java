package edu.cnm.deepdive.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

  public static void main(String[] args) {
    // read spring config java class
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(SportConfig.class);
    //get the bean from the spring container
    Coach theCoach = context.getBean("swimCoach", Coach.class);
    //call a method on the bean
    System.out.println(theCoach.getDailyWorkout());
    //call method to get the daily fortune
    System.out.println("\n" + theCoach.getDailyFortune());
    //close the context
    context.close();


  }
}

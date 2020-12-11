package edu.cnm.deepdive.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

  public static void main(String[] args) {
    // read spring config file
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");
    //get the bean from the spring container
    Coach theCoach = context.getBean("motorcycleCoach", Coach.class);
    //call a method on the bean
    System.out.println(theCoach.getDailyWorkout());
    //close the context
    context.close();
  }
}

package edu.cnm.deepdive.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

  public static void main(String[] args) {
    //load spring config file
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");
    //retrieve bean from spring container (No @Scope annotation means singleton as default)
    Coach theCoach = context.getBean("tennisCoach", Coach.class);

    Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

    //check if they are the same
    boolean result = (theCoach == alphaCoach);
    System.out.println("\nPointing out to the same object: " + result);

    System.out.println("\nMemory location for theCoach: " + theCoach);

    System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

    //close the context
    context.close();

  }

}
package edu.cnm.deepdive.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("edu.cnm.deepdive.springdemo")
public class SportConfig {

  //define bean for a sad fortune service
  @Bean
  public FortuneService sadFortuneService() {
    return new SadFortuneService();
  }

  //define bean for a swim coach AND inject dependency
  @Bean
  public Coach swimCoach() {
    return new SwimCoach(sadFortuneService());
  }

}

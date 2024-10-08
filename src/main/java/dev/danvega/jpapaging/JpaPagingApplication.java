package dev.danvega.jpapaging;

import net.datafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaPagingApplication {

  public static void main(String[] args) {
    SpringApplication.run(JpaPagingApplication.class, args);
  }

  @Bean
  Faker faker() {
    return new Faker();
  }

}

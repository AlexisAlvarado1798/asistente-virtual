package com.fundacionnacervivir.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.fundacionnacervivir.*"})
@EnableJpaRepositories("com.fundacionnacervivir.mod.core.repositories")
@EntityScan("com.fundacionnacervivir.mod.core.entities")
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}

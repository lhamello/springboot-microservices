package br.com.lhamello.springbootmicroservices.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"br.com.lhamello.springbootmicroservices.core.model"})
@EnableJpaRepositories({"br.com.lhamello.springbootmicroservices.core.repository"})
public class SpringBootMicroserivesApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootMicroserivesApplication.class, args);
  }
}
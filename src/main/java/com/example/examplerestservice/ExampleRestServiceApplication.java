package com.example.examplerestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.MediaType;

@RestController
@SpringBootApplication
public class ExampleRestServiceApplication {

  @GetMapping(path = "/health", produces = MediaType.APPLICATION_JSON_VALUE)
  public String checkCondition() {
    return "{'status':'OK'}";
  }

  public static void main(String[] args) {
    SpringApplication.run(ExampleRestServiceApplication.class, args);
  }
}

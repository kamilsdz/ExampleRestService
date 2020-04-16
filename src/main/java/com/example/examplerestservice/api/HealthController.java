package com.example.examplerestservice.api.healthcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.MediaType;

@RestController
public class HealthController {

  @GetMapping(path = "/health", produces = MediaType.APPLICATION_JSON_VALUE)
  public String checkCondition() {
    return "{'status':'OK'}";
  }
}

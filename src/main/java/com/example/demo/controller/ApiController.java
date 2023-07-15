package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api") 
public class ApiController {

  @GetMapping
  public String getApiTest(Model model) {
    return "test";
  }
}

// curl -v -X GET "http://localhost:8080/api"

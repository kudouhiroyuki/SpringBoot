package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/parks") 
public class ParkController {

  @Autowired

  @GetMapping
  public String getParks() {
    return "comments/index";
  }
}

// curl -v -X GET "http://localhost:8080/parks"
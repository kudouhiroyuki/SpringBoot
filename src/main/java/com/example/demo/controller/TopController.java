package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

@RestController
@RequestMapping("/") 
public class TopController {

  @GetMapping
  public Map<String, String> index() {
    return Map.of("key", "value");
  }
	
//  @GetMapping
//  public String index(Model model) {
//    model.addAttribute("message", "TopController index");   
//    return "index";
//  }
}

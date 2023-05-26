package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/") 
public class TopController {

  @GetMapping
  public String index(Model model) {
    model.addAttribute("message", "TopController index");   
    return "index";
  }
}

package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopController {
  @GetMapping("/")
  public String demo(Model model) {
    model.addAttribute("message", "index");
    return "index";
  }
}



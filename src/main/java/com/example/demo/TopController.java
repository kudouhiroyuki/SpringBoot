package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopController {
  @RequestMapping("/")
  public String demo(Model model) {
    model.addAttribute("message", "index");
    return "index";
  }
}

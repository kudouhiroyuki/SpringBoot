package com.example.demo.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user") 
public class UserController {
  @GetMapping
  public String index(Model model) {
    model.addAttribute("message", "UserController index");   
    return "index";
  }
}

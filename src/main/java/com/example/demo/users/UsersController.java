package com.example.demo.users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsersController {
  @RequestMapping("/users")
  public String demo(Model model) {
    model.addAttribute("message", "index");
    return "users/index";
  }
}

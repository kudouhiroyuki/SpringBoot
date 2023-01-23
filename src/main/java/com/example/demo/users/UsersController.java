package com.example.demo.users;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import com.example.demo.users.dto.request.UsersIndexGetRequestDto;

@Controller
@RequestMapping("/users")
public class UsersController {
  @Autowired
  private UsersService usersService;
  
  @GetMapping
  public String index(Model model) {
    List<?> users = usersService.findUsers();
    model.addAttribute("users", users);
    return "users/index";
  }

  @GetMapping("/create")
  public String create() {
    return "users/create";
  }
  
  @GetMapping("/{id}")
  public String edit(@PathVariable int id, Model model) {
//    List<Map<String, Object>> users = usersService.findUserById(id);
//	model.addAttribute("users", users);
    return "users/edit";
  }
  
  @PostMapping
  public String store(Object body) {
//    usersService.createUser(body);
    return "redirect:/users";
  }
}

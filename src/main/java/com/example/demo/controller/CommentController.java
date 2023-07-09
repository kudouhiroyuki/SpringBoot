package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.validation.annotation.Validated;
import org.springframework.validation.BindingResult;

import com.example.demo.entity.CommentEntity;
import com.example.demo.service.CommentService;

@Controller
@RequestMapping("/comments") 
public class CommentController {

  @Autowired
  private CommentService commentService;

  @GetMapping
  public String index(Model model) {
    List<CommentEntity> comments = commentService.findCommentAll();
    model.addAttribute("comments", comments);
    return "comments/index";
  }

  @DeleteMapping("/{id}")
  public String destroy(@PathVariable int id) {
    commentService.destroyComment(id);
    return "redirect:/comments";
  }
}

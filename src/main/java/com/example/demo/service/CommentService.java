package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.CommentEntity;
import com.example.demo.repository.CommentRepository;

@Service
public class CommentService {
  
  @Autowired
  private CommentRepository commentRepository;
  
  
  public List<CommentEntity> findCommentAll() {
    return commentRepository.findAll();
  }
  
  public Optional<CommentEntity> findcommentById(int id) {
    return commentRepository.findById(id);
  }
  
  public void createcomment(CommentEntity comment) {
    commentRepository.save(comment);
  }
  
  public void updatecomment(CommentEntity comment) {
    commentRepository.save(comment);
  }
  
  public void destroycomment(int id) {
    commentRepository.deleteById(id);
  }
}

package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.PostEntity;
import com.example.demo.repository.PostRepository;

@Service
public class PostService {
  
  @Autowired
  private PostRepository postRepository;
  
  
  public List<PostEntity> findPostAll() {
    return postRepository.findAll();
  }
  
  public Optional<PostEntity> findPostById(int id) {
    return postRepository.findById(id);
  }
  
  public void createPost(PostEntity Post) {
    postRepository.save(Post);
  }
  
  public void updatePost(PostEntity Post) {
    postRepository.save(Post);
  }
  
  public void destroyPost(int id) {
    postRepository.deleteById(id);
  }
}

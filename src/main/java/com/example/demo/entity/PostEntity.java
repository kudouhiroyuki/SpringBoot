package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Pattern;

import java.sql.Date;
import lombok.Data;

@Entity
@Data
@Table(name = "post")
public class PostEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;

  @NotEmpty(message = "タイトルを入力してください")
  @Size(min = 1, max = 30, message = "タイトルは60文字以内で入力してください")
  @Column(name = "title", nullable = false, length = 60)
  private String title;
  
  @NotEmpty(message = "本文を入力してください")
  @Size(min = 1, max = 255, message = "本文は255文字以内で入力してください")
  @Column(name = "content", nullable = false, length = 255)
  private String content;

  @Column(name = "created_at", nullable = false)
  private Date createdAt;
  
  @Column(name = "updated_at", nullable = false)
  private Date updatedAt;
}

package com.example.demo.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import java.util.Date;

import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class UserEntity {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  
  @Column(name = "user_name", nullable = false, length = 191)
  private String userName;
  
  @Column(name = "password", nullable = false, length = 191)
  private String password;
  
  @Column(name = "address", nullable = false, length = 191)
  private String address;
  
  @Column(name = "age", nullable = false, length = 191)
  private String age;
  
  @Column(name = "department_id", nullable = true, length = 191)
  private String departmentId;
  
  @Column(name = "point", nullable = true)
  private int point;
  
  @Column(name = "created_at", nullable = false)
  private String createdAt;
  
  @Column(name = "update_at", nullable = false)
  private String updateAt;
}

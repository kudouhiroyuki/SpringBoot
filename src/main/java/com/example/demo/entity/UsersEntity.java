package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "user")
public class UsersEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  
  @Column(name = "user_name", nullable = false, length = 191)
  private String userName;
  
  public int getId() {
      return id;
  }
  public void setId(int id) {
      this.id = id;
  }
 
  public String getUserName() {
      return userName;
  }
  public void setUserName(String userName) {
      this.userName = userName;
  }
}
package com.example.demo.users.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;

//@Data
//@Setter
//@Getter
@Entity
//@Table(name = "users")
public class Users {
  @Id
  int id;
  
  public int getId() {
    return id;
  }
}

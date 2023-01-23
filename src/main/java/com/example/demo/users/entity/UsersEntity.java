package com.example.demo.users.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class UsersEntity {
  @Id
  int id;
}

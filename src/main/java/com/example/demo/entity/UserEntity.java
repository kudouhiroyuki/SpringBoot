package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;

import java.sql.Date;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class UserEntity {
  @Id
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
  
//  @ManyToOne
//  @JoinColumn(name = "department_id")
//  private DepartmentEntity department;
  
  @Column(name = "department_id", length = 191)
  private String departmentId;
  
  @Column(name = "point", nullable = false)
  private Integer point;
  
  @Column(name = "created_at", nullable = false)
  private Date createdAt;
  
  @Column(name = "updated_at", nullable = false)
  private Date updatedAt;
}

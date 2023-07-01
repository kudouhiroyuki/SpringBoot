package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

import lombok.Data;

@Data
@Entity
@Table(name = "department")
public class DepartmentEntity {
  @Id
  private String departmentId;
  
  @Column(name = "department_name", nullable = false, length = 30) 
  private String departmentName;
}

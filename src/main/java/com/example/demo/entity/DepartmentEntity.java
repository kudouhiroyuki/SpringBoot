package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
@Table(name = "department")
public class DepartmentEntity {
  @Id
  private String departmentId;
  
  @Column(name = "department_name", nullable = false, length = 191) 
  private String departmentName;
}

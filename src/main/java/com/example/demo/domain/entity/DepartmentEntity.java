package com.example.demo.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

import lombok.Data;

@Data
@Entity
@Table(name = "department")
public class DepartmentEntity {
  @Id
  int id;
  
  @Column(name = "department_id", nullable = false, length = 191)
  private String departmentId;
  
  @Column(name = "department_name", nullable = false, length = 191)
  private String departmentName;
}

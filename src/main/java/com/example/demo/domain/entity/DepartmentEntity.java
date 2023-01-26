package com.example.demo.domain.entity;

import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;

import lombok.Data;

@Data
@Entity
@Table(name = "department")
public class DepartmentEntity {
  @Id
  @Column(name = "department_id")
  private String departmentId;
  
  @Column(name = "department_name", nullable = false, length = 191)
  private String departmentName;
  
  @OneToMany
  @JoinColumn(name = "department_id")
  private List<UserEntity> users = new ArrayList<>();
}

package com.example.demo.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import java.util.Date;

import lombok.Data;

@Data
@Entity
@Table(name = "department")
public class DepartmentEntity {
  @Id
  @Column(name = "department_id", nullable = false, length = 191)
  private String departmentId;
  
  @Column(name = "department_name", nullable = false, length = 191)
  private String departmentName;
}

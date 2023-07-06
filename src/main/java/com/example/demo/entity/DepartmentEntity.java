package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Column;

import lombok.Data;

@Data
@Entity
@Table(name = "mst_department")
public class DepartmentEntity {
  @Id
  @NotEmpty(message = "部署IDを入力してください")
  @Size(min = 1, max = 30, message = "部署IDは30文字以内で入力してください")
  @Column(name = "department_id", nullable = false, length = 30) 
  private String departmentId;
  
  @NotEmpty(message = "部署名を入力してください")
  @Size(min = 1, max = 30, message = "部署名は30文字以内で入力してください")
  @Pattern(regexp = "^[\\u4E00-\\u9FFF]+$", message = "部署名は漢字で入力してください")
  @Column(name = "department_name", nullable = false, length = 30) 
  private String departmentName;
}

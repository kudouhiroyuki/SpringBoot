package com.example.demo.dto.request;

import java.sql.Date;

import com.example.demo.entity.DepartmentEntity;

import jakarta.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class UserCreateRequestDto {
  @NotEmpty(message = "名前を入力してください")
  private String userName;
  
  private String password;
  
  private String address;
  
  private String age;
  
  private String departmentId;
  
  private DepartmentEntity department;
  
  private Integer point;
  
  private Date createdAt;
  
  private Date updatedAt;
}
package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

import java.sql.Date;
import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  
  @NotEmpty(message = "名前を入力してください")
  @Column(name = "user_name", nullable = false, length = 60)
  @Size(min = 1, max = 60, message = "名前は60文字以内で入力してください")
  private String userName;
  
  @NotEmpty(message = "パスワードを入力してください")
  @Column(name = "password", nullable = false, length = 255)
  private String password;
  
  @NotEmpty(message = "メールアドレスを入力してください")
  @Email(message = "メールアドレスを正しく入力してください")
  @Column(name = "address", nullable = false, length = 191)
  private String address;
  
  @Column(name = "age", nullable = false, length = 191)
  private String age;
 
  @ManyToOne
  @JoinColumn(name = "department_id")
  private DepartmentEntity department;
  
  @Column(name = "department_id", nullable = false, length = 191, updatable = false, insertable = false)
  private String departmentId;
  
  @Column(name = "point", nullable = false)
  private Integer point;
  
  @Column(name = "created_at", nullable = false)
  private Date createdAt;
  
  @Column(name = "updated_at", nullable = false)
  private Date updatedAt;
}

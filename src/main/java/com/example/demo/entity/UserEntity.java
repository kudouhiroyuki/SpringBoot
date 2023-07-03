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
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Pattern;

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
  @Size(min = 1, max = 60, message = "名前は60文字以内で入力してください")
  @Pattern(regexp = "^[\\u4E00-\\u9FFF]+$", message = "名前は漢字で入力してください")
  @Column(name = "user_name", nullable = false, length = 60)
  private String userName;
  
  @NotEmpty(message = "パスワードを入力してください")
  @Size(min = 8, max = 100, message = "パスワードは8〜100文字以内で入力してください")
  @Pattern(regexp = "^[!-~]+$", message = "パスワードは数字・英字・記号で入力してください")
  @Column(name = "password", nullable = false, length = 100)
  private String password;
  
  @NotEmpty(message = "メールアドレスを入力してください")
  @Email(message = "メールアドレスを正しく入力してください")
  @Size(min = 1, max = 255, message = "メールアドレスは255文字以内で入力してください")
  @Column(name = "address", nullable = false, length = 255)
  private String address;
  
  @NotEmpty(message = "年齢を入力してください")
  @Positive(message = "年齢を正しく入力してください")
  @Column(name = "age", nullable = false)
  private String age;
 
  @ManyToOne
  @JoinColumn(name = "department_id")
  private DepartmentEntity department;
  
  @NotEmpty(message = "部署を入力してください")
  @Column(name = "department_id", nullable = false, length = 30, updatable = false, insertable = false)
  private String departmentId;
  
  @Column(name = "point", nullable = false)
  private Integer point;
  
  @Column(name = "created_at", nullable = false)
  private Date createdAt;
  
  @Column(name = "updated_at", nullable = false)
  private Date updatedAt;
}

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
import jakarta.validation.constraints.Size;

import java.sql.Date;
import lombok.Data;

@Entity
@Data
@Table(name = "abbreviations")
public class AbbreviationsEntity {
  // 識別ID(略号ID)
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  // 略号コード
  @Column(name = "code", length = 10 , nullable = false)
  private String code;

  // 略号名称
  @Column(name = "name", length = 255 , nullable = false)
  private String name;

  // 部門ID
  @Column(name = "department_code", length = 6, nullable = false)
  private String departmentCode;

  // グループID
  @Column(name = "department_group_code", nullable = false)
  private String departmentGroupCode;
}

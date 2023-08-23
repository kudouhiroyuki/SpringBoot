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
@Table(name = "notification")
public class NotificationEntity {
  // 識別ID(お知らせID)
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  // 配信開始日時
  @Column(name = "derivery_started_at", nullable = false)
  private Date deriveryStartedAt;

  // 配信終了日時
  @Column(name = "derivery_ended_at", nullable = false)
  private Date deriveryEndedAt;

  // 件名
  @Column(name = "subject", nullable = false, length = 50)
  private String subject;

  // 本文
  @Column(name = "body", nullable = false, length = 50)
  private String body;

  // 重要フラグ
  @Column(name = "is_important", nullable = false)
  private boolean isImportant;

  // 登録従業員番号
  @Column(name = "created_employee_number", nullable = false)
  private int createdEmployeeNumber;

  // 更新従業員番号
  @Column(name = "updated_employee_number", nullable = false)
  private int updatedEmployeeNumber;

  // 登録日時
  @Column(name = "created_at", nullable = false)
  private Date createdAt;

  // 更新日時
  @Column(name = "updated_at", nullable = false)
  private Date updatedAt;
}

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

/**
 * パークマスタテーブル用エンティティ
 */
@Entity
@Data
@Table(name = "parks")
public class ParksEntity {
  // 識別ID(パークID)
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  // パークコード
  @Column(name = "code", length = 10, nullable = false)
  private String code;

  // パーク名
  @Column(name = "name", length = 255, nullable = false)
  private String name;

  // 削除フラグ
  @Column(name = "is_deleted", nullable = false)
  private boolean isDeleted;
}

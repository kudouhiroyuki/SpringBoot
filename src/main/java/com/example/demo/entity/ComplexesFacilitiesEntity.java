package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.Data;

@Entity
@Data
@Table(name = "complexes_facilities")
public class ComplexesFacilitiesEntity {
  // 識別ID(施設ID)
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  // コンプレックスID
  @Column(name = "area_complex_id", nullable = false)
  private int areaComplexId;

  // 施設コード
  @Column(name = "code", length = 10, nullable = false)
  private String code;

  // 施設名
  @Column(name = "name", length = 255, nullable = false)
  private String name;

  // 削除フラグ
  @Column(name = "is_deleted", nullable = false)
  private boolean isDeleted;
}
  
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
@Table(name = "areas_complexes")
public class AreasComplexesEntity {
  // 識別ID(コンプレックスID)
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  // エリアID
  @Column(name = "park_area_id", nullable = false)
  private int parkAreaId;

  // コンプレックスコード
  @Column(name = "code", length = 10, nullable = false)
  private String code;

  // コンプレックス名
  @Column(name = "name", length = 255, nullable = false)
  private String name;

  // 削除フラグ
  @Column(name = "is_deleted", nullable = false)
  private boolean isDeleted;
}
  
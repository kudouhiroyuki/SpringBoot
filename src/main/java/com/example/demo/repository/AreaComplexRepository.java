package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AreasComplexesEntity;

@Repository
public interface AreaComplexRepository extends JpaRepository<AreasComplexesEntity,Integer>{
  /**
   * 対象のエリアに紐づくコンプレックスの一覧を取得する。
   * @param areaIds エリアID(配列)
   * @return コンプレックスの一覧
   */
  List<AreasComplexesEntity> findByParkAreaIdIn(List<Integer> areaIds);
}
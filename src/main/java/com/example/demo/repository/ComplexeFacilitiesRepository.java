package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ComplexesFacilitiesEntity;

@Repository
public interface ComplexeFacilitiesRepository extends JpaRepository<ComplexesFacilitiesEntity,Integer>{
  /**
   * 対象のコンプレックスに紐づく施設の一覧を取得する。
   * @param complexIds コンプレックスID(配列)
   * @return 施設の一覧
   */
  List<ComplexesFacilitiesEntity> findByAreaComplexIdIn(List<Integer> complexIds);
}
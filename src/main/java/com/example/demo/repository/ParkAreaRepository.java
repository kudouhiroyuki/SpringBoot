package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ParksAreasEntity;

@Repository
public interface ParkAreaRepository extends JpaRepository<ParksAreasEntity,Integer>{
  /**
   * 対象のパークに紐づくエリアの一覧を取得する。
   *
   * @param parkIds パークID(配列)
   * @return エリアの一覧
   */
  List<ParksAreasEntity> findByParkIdIn(List<Integer> parkIds);
}
package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TypesEntity;

@Repository
public interface TypeRepository extends JpaRepository<TypesEntity,Integer>{
  /**
   * 種類の一覧を取得する。
   * @param ids 種類ID(配列)
   * @return 種類の一覧
   */
  List<TypesEntity> findByIdIn(List<Integer> ids);
}
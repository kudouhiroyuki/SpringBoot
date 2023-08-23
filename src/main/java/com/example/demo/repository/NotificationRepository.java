package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.NotificationEntity;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationEntity,Integer>{

  // 動的クエリーが上手く動かない
  @Query(value = "SELECT * FROM spring.notification")
  List<NotificationEntity> findNotificationAll();
}
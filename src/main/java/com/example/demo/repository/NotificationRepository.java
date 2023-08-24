package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.NotificationEntity;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationEntity,Integer>{
  // SELECT * FROM spring.notification WHERE is_important = true;
  // SELECT * FROM spring.notification WHERE is_important = false;
  @Query(value = "SELECT * FROM notification WHERE is_important", nativeQuery = true)
  List<NotificationEntity> findNotificationAll();
}
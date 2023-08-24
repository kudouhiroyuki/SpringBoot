package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.NotificationEntity;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationEntity,Integer>{

  @Query(value = "SELECT * FROM notification", nativeQuery = true)
  List<NotificationEntity> findNotificationAll();
}
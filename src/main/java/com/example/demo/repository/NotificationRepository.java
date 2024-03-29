package com.example.demo.repository;

import java.util.List;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.NotificationsEntity;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationsEntity,Integer>{
  // SELECT * FROM spring.notifications WHERE is_important = true;
  // SELECT * FROM spring.notifications WHERE is_important = false;
  // SELECT * FROM spring.notifications WHERE NOW() BETWEEN derivery_started_at and derivery_ended_at;
  // SELECT * FROM spring.notifications WHERE is_important = true AND (NOW() BETWEEN derivery_started_at AND derivery_ended_at);
  @Query(value = "SELECT * FROM notifications WHERE is_important = ?1 AND (?2 BETWEEN derivery_started_at AND derivery_ended_at)", nativeQuery = true)
  List<NotificationsEntity> findNotifications(int isImportant, Date dateTime);
  
  // SELECT COUNT(*) FROM spring.notifications WHERE is_important = true;
  // SELECT COUNT(*) FROM spring.notifications WHERE is_important = false;
  // SELECT COUNT(*) FROM spring.notifications WHERE NOW() BETWEEN derivery_started_at and derivery_ended_at;
  // SELECT COUNT(*) FROM spring.notifications WHERE is_important = true AND (NOW() BETWEEN derivery_started_at AND derivery_ended_at);
  @Query(value = "SELECT COUNT(*) FROM notifications WHERE is_important = ?1 AND (?2 BETWEEN derivery_started_at AND derivery_ended_at)", nativeQuery = true)
  int countNotifications(int isImportant, Date dateTime);
}
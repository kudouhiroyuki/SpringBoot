package com.example.demo.controller;

import java.util.List;
import java.util.Date;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.repository.NotificationRepository;
import com.example.demo.entity.NotificationsEntity;

@RestController
public class NotificationController {
  @Autowired
  private NotificationRepository notificationRepository;

  /**
   * お知らせ一覧取得API(GET:/notifications/list/{is_important})
   * curl -v -X GET "http://localhost:8080/notifications/list/0"
   * curl -v -X GET "http://localhost:8080/notifications/list/1"
   */
  @RequestMapping("notifications/list/{isImportant}")
  public List<NotificationsEntity> getNotifications(@PathVariable int isImportant) {
    // DBからお知らせの一覧を取得する。
    List<NotificationsEntity> notifications = notificationRepository.findNotifications(isImportant, new Date());
    return notifications;
  }
}
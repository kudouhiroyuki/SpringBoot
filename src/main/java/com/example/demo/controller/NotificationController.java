package com.example.demo.controller;

import java.util.List;
import java.util.Date;
import java.util.Optional;

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
  @RequestMapping("notifications/list/{is_important}")
  public List<NotificationsEntity> getNotifications(@PathVariable("is_important") int isImportant) {
    // DBからお知らせの一覧を取得する。
    List<NotificationsEntity> notifications = notificationRepository.findNotifications(isImportant = 1, new Date());
    return notifications;
  }

  /**
   * お知らせ件数取得API(GET:/notifications/list/{is_important}/count)
   * curl -v -X GET "http://localhost:8080/notifications/list/0/count"
   * curl -v -X GET "http://localhost:8080/notifications/list/1/count"
   */
  @RequestMapping("notifications/list/{is_important}/count")
  public int getNotificationsCount(@PathVariable("is_important") int isImportant) {
    // DBからお知らせの件数を取得する。
    int notificationsCount = notificationRepository.countNotifications(isImportant = 1, new Date());
    return notificationsCount;
  }

  /**
   * お知らせ取得API(GET:/notifications/{notification_id})
   * curl -v -X GET "http://localhost:8080/notifications/1"
   * curl -v -X GET "http://localhost:8080/notifications/2"
   */
  @RequestMapping("notifications/{notification_id}")
  public Optional<NotificationsEntity> getNotificaton(@PathVariable("notification_id") int id) {
    // DBからお知らせを取得する。
    Optional<NotificationsEntity> notification = notificationRepository.findById(id);
    return notification;
  }
}
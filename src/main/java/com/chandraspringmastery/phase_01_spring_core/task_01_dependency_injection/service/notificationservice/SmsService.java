package com.chandraspringmastery.phase_01_spring_core.task_01_dependency_injection.service.notificationservice;

import org.springframework.stereotype.Component;

@Component
public class SmsService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS Notification: " + message);
    }
}

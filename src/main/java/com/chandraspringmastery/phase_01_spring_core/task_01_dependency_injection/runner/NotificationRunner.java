package com.chandraspringmastery.phase_01_spring_core.task_01_dependency_injection.runner;

import com.chandraspringmastery.phase_01_spring_core.task_01_dependency_injection.service.notificationservice.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NotificationRunner implements CommandLineRunner {
    @Autowired
    private NotificationDispatcher notificationDispatcher;
    @Override
    public void run(String... args){
        notificationDispatcher.dispatchNotification("Welcome to Spring DI Mastery!");
    }
}

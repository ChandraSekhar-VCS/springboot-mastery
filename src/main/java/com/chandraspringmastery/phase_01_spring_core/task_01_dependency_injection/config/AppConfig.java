package com.chandraspringmastery.phase_01_spring_core.task_01_dependency_injection.config;

import com.chandraspringmastery.phase_01_spring_core.task_01_dependency_injection.runner.NotificationDispatcher;
import com.chandraspringmastery.phase_01_spring_core.task_01_dependency_injection.service.notificationservice.PushNotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    @Bean
    @Primary
    public PushNotificationService pushNotificationService() {
        return new PushNotificationService();
    }
}

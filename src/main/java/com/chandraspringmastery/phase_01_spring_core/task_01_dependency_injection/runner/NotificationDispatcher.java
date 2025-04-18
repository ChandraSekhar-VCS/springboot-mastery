package com.chandraspringmastery.phase_01_spring_core.task_01_dependency_injection.runner;

import com.chandraspringmastery.phase_01_spring_core.task_01_dependency_injection.service.auditservice.AuditService;
import com.chandraspringmastery.phase_01_spring_core.task_01_dependency_injection.service.notificationservice.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationDispatcher {
    private final NotificationService notificationService;
    private AuditService auditService;
    @Autowired
    public NotificationDispatcher(@Qualifier("smsService") NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    @Autowired(required = false)
    public void setAuditService(AuditService auditService) {
        this.auditService = auditService;
    }
    public void dispatchNotification(String message) {
        notificationService.sendNotification(message);
        if(auditService != null){
            auditService.audit();
        }
        else{
            System.out.println("Audit skipped (no AuditService bean available)");
        }
    }
}

package com.chandraspringmastery.phase_01_spring_core.task_01_dependency_injection.service.auditservice;

public class GeneralAudit implements AuditService {
    @Override
    public void audit() {
        System.out.println("General Audit in process");
    }
}

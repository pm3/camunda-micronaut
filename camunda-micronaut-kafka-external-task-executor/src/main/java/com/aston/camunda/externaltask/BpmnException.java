package com.aston.camunda.externaltask;

public class BpmnException extends Exception {

    String code;

    public BpmnException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

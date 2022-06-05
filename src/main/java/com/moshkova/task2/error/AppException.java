package com.moshkova.task2.error;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class AppException extends ResponseStatusException {
    private final ErrorAttributeOptions options;

    public AppException(HttpStatus status, String message, ErrorAttributeOptions options) {
        super(status, message);
        this.options = options;
    }

    public String getMessage() {
        return this.getReason();
    }

    public ErrorAttributeOptions getOptions() {
        return this.options;
    }
}

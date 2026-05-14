package com.lib.exception.enums;

import org.springframework.http.HttpStatus;

public enum ExceptionEnum {
    NOT_FOUND(HttpStatus.NOT_FOUND, "Resource not found"),
    BUSINESS_ERROR(HttpStatus.BAD_REQUEST, "Business error"),
    CONFLICT(HttpStatus.CONFLICT, "Data conflict"),
    VALIDATION_ERROR(HttpStatus.UNPROCESSABLE_ENTITY, "Validation error"),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "Unauthorized"),
    FORBIDDEN(HttpStatus.FORBIDDEN, "Access denied"),
    INTEGRATION_ERROR(HttpStatus.BAD_GATEWAY, "Integration error"),
    INTERNAL_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error");

    private final HttpStatus status;
    private final String message;

    ExceptionEnum(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
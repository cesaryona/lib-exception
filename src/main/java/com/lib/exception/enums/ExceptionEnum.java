package com.lib.exception.enums;

import org.springframework.http.HttpStatus;

public enum ExceptionEnum {
    NOT_FOUND(HttpStatus.NOT_FOUND, "Recurso não encontrado"),
    BUSINESS_ERROR(HttpStatus.BAD_REQUEST, "Erro de negócio"),
    CONFLICT(HttpStatus.CONFLICT, "Conflito de dados");

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
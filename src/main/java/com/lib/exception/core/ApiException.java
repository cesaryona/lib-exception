package com.lib.exception.core;

import com.lib.exception.enums.ExceptionEnum;

public class ApiException extends RuntimeException{

    private final ExceptionEnum type;
    private final String detail;

    public ApiException(ExceptionEnum type) {
        super(type.getMessage());
        this.type = type;
        this.detail = null;
    }

    public ApiException(ExceptionEnum type, String detail) {
        super(detail);
        this.type = type;
        this.detail = detail;
    }

    public ExceptionEnum getType() {
        return type;
    }

}

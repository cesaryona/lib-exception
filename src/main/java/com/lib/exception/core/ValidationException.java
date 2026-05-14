package com.lib.exception.core;

import com.lib.exception.enums.ExceptionEnum;

public class ValidationException extends ApiException {

    public ValidationException() {
        super(ExceptionEnum.VALIDATION_ERROR);
    }

    public ValidationException(String detail) {
        super(ExceptionEnum.VALIDATION_ERROR, detail);
    }
}

package com.lib.exception.core;

import com.lib.exception.enums.ExceptionEnum;

public class ConflictException extends ApiException {

    public ConflictException() {
        super(ExceptionEnum.CONFLICT);
    }

    public ConflictException(String detail) {
        super(ExceptionEnum.CONFLICT, detail);
    }
}

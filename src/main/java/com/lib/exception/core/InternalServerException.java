package com.lib.exception.core;

import com.lib.exception.enums.ExceptionEnum;

public class InternalServerException extends ApiException {

    public InternalServerException() {
        super(ExceptionEnum.INTERNAL_ERROR);
    }

    public InternalServerException(String detail) {
        super(ExceptionEnum.INTERNAL_ERROR, detail);
    }
}

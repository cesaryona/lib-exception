package com.lib.exception.core;

import com.lib.exception.enums.ExceptionEnum;

public class NotFoundException extends ApiException {

    public NotFoundException() {
        super(ExceptionEnum.NOT_FOUND);
    }

    public NotFoundException(String detail) {
        super(ExceptionEnum.NOT_FOUND, detail);
    }
}

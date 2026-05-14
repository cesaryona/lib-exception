package com.lib.exception.core;

import com.lib.exception.enums.ExceptionEnum;

public class ForbiddenException extends ApiException {

    public ForbiddenException() {
        super(ExceptionEnum.FORBIDDEN);
    }

    public ForbiddenException(String detail) {
        super(ExceptionEnum.FORBIDDEN, detail);
    }
}

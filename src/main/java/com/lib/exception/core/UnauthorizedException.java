package com.lib.exception.core;

import com.lib.exception.enums.ExceptionEnum;

public class UnauthorizedException extends ApiException {

    public UnauthorizedException() {
        super(ExceptionEnum.UNAUTHORIZED);
    }

    public UnauthorizedException(String detail) {
        super(ExceptionEnum.UNAUTHORIZED, detail);
    }
}

package com.lib.exception.core;

import com.lib.exception.enums.ExceptionEnum;

public class BusinessException extends ApiException {

    public BusinessException() {
        super(ExceptionEnum.BUSINESS_ERROR);
    }

    public BusinessException(String detail) {
        super(ExceptionEnum.BUSINESS_ERROR, detail);
    }
}

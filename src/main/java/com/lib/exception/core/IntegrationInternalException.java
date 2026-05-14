package com.lib.exception.core;

import com.lib.exception.enums.ExceptionEnum;

public class IntegrationInternalException extends ApiException {

    public IntegrationInternalException() {
        super(ExceptionEnum.INTEGRATION_ERROR);
    }

    public IntegrationInternalException(String detail) {
        super(ExceptionEnum.INTEGRATION_ERROR, detail);
    }
}

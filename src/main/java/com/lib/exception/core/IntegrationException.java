package com.lib.exception.core;

import com.lib.exception.enums.ExceptionEnum;

public class IntegrationException extends ApiException {

    public IntegrationException() {
        super(ExceptionEnum.INTEGRATION_ERROR);
    }

    public IntegrationException(String detail) {
        super(ExceptionEnum.INTEGRATION_ERROR, detail);
    }
}

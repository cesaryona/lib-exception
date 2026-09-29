package com.lib.exception.response;

import java.util.List;

public record ApiValidationErrorResponse(List<ValidationFieldError> errors) {
}

package com.lib.exception.response;

import java.time.LocalDateTime;
import java.util.List;

public record ApiValidationErrorResponse(int status, LocalDateTime timestamp, List<ValidationFieldError> errors) {
}

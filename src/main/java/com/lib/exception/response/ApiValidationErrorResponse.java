package com.lib.exception.response;

import java.time.LocalDateTime;
import java.util.List;

public record ApiValidationErrorResponse(
        int code,
        String status,
        String message,
        List<String> errors,
        LocalDateTime timestamp
) {
}

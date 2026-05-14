package com.lib.exception.response;

import java.time.LocalDateTime;

public record ApiErrorResponse(
        int code,
        String status,
        String message,
        LocalDateTime timestamp
) {
}

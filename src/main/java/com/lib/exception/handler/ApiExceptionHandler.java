package com.lib.exception.handler;

import com.lib.exception.core.ApiException;
import com.lib.exception.response.ApiErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ApiErrorResponse> handleApiException(ApiException e) {
        var type = e.getType();
        var response = new ApiErrorResponse(
                type.getStatus().value(),
                type.getStatus().name(),
                e.getMessage(),
                LocalDateTime.now()
        );
        return ResponseEntity.status(type.getStatus()).body(response);
    }
}

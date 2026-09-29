package com.lib.exception.response;

public record ValidationFieldError(String field, String message) {
}

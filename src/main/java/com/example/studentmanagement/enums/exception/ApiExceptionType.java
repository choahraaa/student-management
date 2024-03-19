package com.example.studentmanagement.enums.exception;

import org.springframework.http.HttpStatus;

public enum ApiExceptionType {
    BAD_REQUEST_BODY(HttpStatus.BAD_REQUEST, "필수 파라미터(#0)가 없습니다."),
    INVALID(HttpStatus.BAD_REQUEST, "유효하지 않은 값입니다."),
    ALREADY_EXIST_STUDENT(HttpStatus.BAD_REQUEST, "이미 존재하는 학생입니다. [#0]");

    private final HttpStatus status;

    private final String message;

    ApiExceptionType(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

}

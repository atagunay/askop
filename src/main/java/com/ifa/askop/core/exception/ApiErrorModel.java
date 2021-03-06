package com.ifa.askop.core.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;

@Data
public class ApiErrorModel {

    private HttpStatus status;
    private String message = "API ERRORS";
    private List<String> errors;

    public ApiErrorModel(HttpStatus status, List<String> errors) {
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public ApiErrorModel(HttpStatus status, String error) {
        this.status = status;
        this.message = message;
        errors = Arrays.asList(error);
    }
}
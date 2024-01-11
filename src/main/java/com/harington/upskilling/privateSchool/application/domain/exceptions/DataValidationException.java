package com.harington.upskilling.privateSchool.application.domain.exceptions;

public class DataValidationException extends RuntimeException {
    public DataValidationException(String message) {
        super(message);
    }
}

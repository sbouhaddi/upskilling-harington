package com.harington.upskilling.privateSchool.application.domain.exceptions;

public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException(String message) {
        super(message);
    }
}

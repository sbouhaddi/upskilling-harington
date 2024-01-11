package com.harington.upskilling.privateSchool.infrastrcuture.adapters.in.rest.exceptionHandler;

import com.harington.upskilling.privateSchool.application.domain.exceptions.DataValidationException;
import com.harington.upskilling.privateSchool.application.domain.exceptions.RecordNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(RecordNotFoundException.class)
    public ApiErrorResponse handleNotFoundException(RecordNotFoundException ex) {

        return new ApiErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage(), null);
    }

    @ExceptionHandler(DataValidationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrorResponse handleDataValidationException(DataValidationException ex) {
        log.error("Handling exception: {}", ex.getMessage());
        return new ApiErrorResponse(HttpStatus.BAD_REQUEST.value(), ex.getMessage(), null);
    }
}

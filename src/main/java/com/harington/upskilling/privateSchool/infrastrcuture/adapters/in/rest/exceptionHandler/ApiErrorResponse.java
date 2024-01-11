package com.harington.upskilling.privateSchool.infrastrcuture.adapters.in.rest.exceptionHandler;

public record ApiErrorResponse(long statut, String message, Object debug) {}

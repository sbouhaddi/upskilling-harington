package com.harington.upskilling.privateSchool.application.ports.in.data;

import com.harington.upskilling.privateSchool.application.ports.in.generics.CreateRequest;
import com.harington.upskilling.privateSchool.domain.model.Subject;

public record CreateSubjectRequest() implements CreateRequest<Subject> {

    @Override
    public Subject toDomainModel() {

        throw new UnsupportedOperationException("Unimplemented method 'toDomainModel'");
    }
}

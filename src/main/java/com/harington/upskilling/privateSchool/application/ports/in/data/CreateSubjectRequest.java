package com.harington.upskilling.privateSchool.application.ports.in.data;

import com.harington.upskilling.privateSchool.application.domain.model.Subject;
import com.harington.upskilling.privateSchool.application.ports.in.generics.CreateRequest;

public record CreateSubjectRequest() implements CreateRequest<Subject> {

    @Override
    public Subject toDomainModel() {

        throw new UnsupportedOperationException("Unimplemented method 'toDomainModel'");
    }
}

package com.harington.upskilling.privateSchool.application.ports.in.data;

import com.harington.upskilling.privateSchool.application.ports.in.generics.UpdateRequest;
import com.harington.upskilling.privateSchool.domain.model.Subject;

public class UpdateSubjectRequest extends UpdateRequest<Subject> {

    @Override
    public Subject toDomainModel() {

        throw new UnsupportedOperationException("Unimplemented method 'toDomainModel'");
    }
}

package com.harington.upskilling.privateSchool.application.ports.in.data;

import com.harington.upskilling.privateSchool.application.ports.in.generics.CreateRequest;
import com.harington.upskilling.privateSchool.domain.model.Teacher;

public record CreateTeacherRequest() implements CreateRequest<Teacher> {

    @Override
    public Teacher toDomainModel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toDomainModel'");
    }
}

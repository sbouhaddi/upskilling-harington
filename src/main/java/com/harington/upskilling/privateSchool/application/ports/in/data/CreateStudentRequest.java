package com.harington.upskilling.privateSchool.application.ports.in.data;

import com.harington.upskilling.privateSchool.application.domain.model.Student;
import com.harington.upskilling.privateSchool.application.ports.in.generics.CreateRequest;

public record CreateStudentRequest() implements CreateRequest<Student> {

    @Override
    public Student toDomainModel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toDomainModel'");
    }
}

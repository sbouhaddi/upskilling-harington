package com.harington.upskilling.privateSchool.application.ports.in.data;

import com.harington.upskilling.privateSchool.domain.model.Student;
import com.harington.upskilling.privateSchool.application.ports.in.generics.UpdateRequest;

public class UpdateStudentRequest extends UpdateRequest<Student> {

    @Override
    public Student toDomainModel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toDomainModel'");
    }
}

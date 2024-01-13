package com.harington.upskilling.privateSchool.application.ports.in.data;

import com.harington.upskilling.privateSchool.domain.model.Teacher;
import com.harington.upskilling.privateSchool.application.ports.in.generics.UpdateRequest;

public class UpdateTeacherRequest extends UpdateRequest<Teacher> {

    @Override
    public Teacher toDomainModel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toDomainModel'");
    }
}

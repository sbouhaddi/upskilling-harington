package com.harington.upskilling.privateSchool.application.domain.service;

import com.harington.upskilling.privateSchool.application.domain.model.Teacher;
import com.harington.upskilling.privateSchool.application.ports.in.TeacherUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateTeacherRequest;
import com.harington.upskilling.privateSchool.application.ports.in.data.UpdateTeacherRequest;
import java.util.List;

public class TeacherService implements TeacherUseCase {

    @Override
    public List<Teacher> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Teacher get(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public void delete(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Teacher update(long id, UpdateTeacherRequest updateRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Teacher create(CreateTeacherRequest createRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }
}

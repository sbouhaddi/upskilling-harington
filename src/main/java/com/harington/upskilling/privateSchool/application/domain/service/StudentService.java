package com.harington.upskilling.privateSchool.application.domain.service;

import com.harington.upskilling.privateSchool.application.domain.model.Student;
import com.harington.upskilling.privateSchool.application.ports.in.StudentUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateStudentRequest;
import com.harington.upskilling.privateSchool.application.ports.in.data.UpdateStudentRequest;
import java.util.List;

public class StudentService implements StudentUseCase {

    @Override
    public List<Student> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Student get(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public void delete(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Student update(long id, UpdateStudentRequest updateRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Student create(CreateStudentRequest createRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }
}

package com.harington.upskilling.privateSchool.application.domain.service;

import com.harington.upskilling.privateSchool.application.domain.model.Subject;
import com.harington.upskilling.privateSchool.application.ports.in.SubjectUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateSubjectRequest;
import com.harington.upskilling.privateSchool.application.ports.in.data.UpdateSubjectRequest;
import java.util.List;

public class SubjectService implements SubjectUseCase {

    @Override
    public List<Subject> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Subject get(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public void delete(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Subject update(long id, UpdateSubjectRequest updateRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Subject create(CreateSubjectRequest createRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }
}

package com.harington.upskilling.privateSchool.application.domain.service;

import com.harington.upskilling.privateSchool.application.domain.model.Classe;
import com.harington.upskilling.privateSchool.application.ports.in.ClasseUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateClasseRequest;
import com.harington.upskilling.privateSchool.application.ports.in.data.UpdateClasseRequest;
import java.util.List;

public class ClasseService implements ClasseUseCase {

    @Override
    public List<Classe> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Classe get(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public void delete(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Classe update(long id, UpdateClasseRequest updateRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Classe create(CreateClasseRequest createRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }
}

package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.repository;

import com.harington.upskilling.privateSchool.application.domain.model.Classe;
import java.util.List;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

@Repository
public class ClasseOutPort implements CrudRepository<Classe> {

    private final DSLContext dslContext;

    public ClasseOutPort(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    @Override
    public Classe get(long id) {
        return null;
    }

    @Override
    public List<Classe> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public void save(Classe data) {}

    @Override
    public void update(Classe data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
}

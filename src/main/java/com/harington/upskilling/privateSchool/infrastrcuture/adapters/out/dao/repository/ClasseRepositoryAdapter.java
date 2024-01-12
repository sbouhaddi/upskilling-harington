package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository;

import com.harington.upskilling.privateSchool.application.domain.model.Classe;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.mapper.ClassePersistanceMapper;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model.ClasseEntity;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository.generic.GenericRepositoryAdapter;
import org.springframework.stereotype.Repository;

@Repository
public class ClasseRepositoryAdapter extends GenericRepositoryAdapter<Classe, ClasseEntity> {

    public ClasseRepositoryAdapter(ClasseJpaRepository classeJpaRepository) {
        super(classeJpaRepository, new ClassePersistanceMapper());
    }
}

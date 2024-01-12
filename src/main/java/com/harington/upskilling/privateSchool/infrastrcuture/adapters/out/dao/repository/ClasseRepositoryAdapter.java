package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository;

import com.harington.upskilling.privateSchool.application.domain.model.Classe;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model.ClasseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class ClasseRepositoryAdapter extends JpaRepositoryAdapter<Classe, ClasseEntity, ClasseJpaRepository> {

    public ClasseRepositoryAdapter(ClasseJpaRepository classeJpaRepository) {
        super(classeJpaRepository);
    }
}

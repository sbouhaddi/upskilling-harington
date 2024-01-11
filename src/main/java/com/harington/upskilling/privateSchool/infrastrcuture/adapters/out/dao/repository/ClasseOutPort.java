package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository;

import com.harington.upskilling.privateSchool.application.domain.model.Classe;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model.ClasseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class ClasseOutPort extends JpaCrudRepository<Classe, ClasseEntity, ClasseJpaRepository> {
    public ClasseOutPort(ClasseJpaRepository classeJpaRepository) {
        super(classeJpaRepository);
    }
}

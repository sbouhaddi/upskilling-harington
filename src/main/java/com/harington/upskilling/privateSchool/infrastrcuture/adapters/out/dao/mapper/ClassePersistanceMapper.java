package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.mapper;

import com.harington.upskilling.privateSchool.application.domain.model.Classe;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model.ClasseEntity;

public class ClassePersistanceMapper implements PersistanceMapper<Classe, ClasseEntity> {
    @Override
    public Classe toDomainModel(ClasseEntity entity) {
        return new Classe(entity.getId(), entity.getLibelle(), entity.getDescription());
    }

    @Override
    public ClasseEntity toPersistanceEntity(Classe model) {
        ClasseEntity classeEntity = new ClasseEntity();
        classeEntity.setLibelle(model.libelle());
        classeEntity.setDescription(model.description());
        return classeEntity;
    }
}

package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.mapper;

import com.harington.upskilling.privateSchool.domain.model.Subject;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model.SubjectEntity;

public class SubjectPersistanceMapper implements PersistanceMapper<Subject, SubjectEntity> {
    @Override
    public Subject toDomainModel(SubjectEntity entity) {
        return null;
    }

    @Override
    public SubjectEntity toPersistanceEntity(Subject model) {
        return null;
    }
}

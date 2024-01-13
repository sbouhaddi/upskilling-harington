package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.mapper;

import com.harington.upskilling.privateSchool.domain.model.Teacher;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model.TeacherEntity;

public class TeacherPersistanceMapper implements PersistanceMapper<Teacher, TeacherEntity> {
    @Override
    public Teacher toDomainModel(TeacherEntity entity) {
        return null;
    }

    @Override
    public TeacherEntity toPersistanceEntity(Teacher model) {
        return null;
    }
}

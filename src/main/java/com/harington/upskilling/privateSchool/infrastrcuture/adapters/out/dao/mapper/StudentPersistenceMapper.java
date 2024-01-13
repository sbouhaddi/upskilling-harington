package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.mapper;

import com.harington.upskilling.privateSchool.application.domain.model.Student;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model.StudentEntity;

public class StudentPersistenceMapper implements PersistanceMapper<Student, StudentEntity> {
    @Override
    public Student toDomainModel(StudentEntity entity) {
        return null;
    }

    @Override
    public StudentEntity toPersistanceEntity(Student model) {
        return null;
    }
}

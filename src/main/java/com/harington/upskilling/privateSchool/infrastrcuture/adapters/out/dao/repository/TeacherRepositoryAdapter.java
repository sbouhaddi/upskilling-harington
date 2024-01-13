package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository;

import com.harington.upskilling.privateSchool.domain.model.Teacher;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.mapper.TeacherPersistanceMapper;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model.TeacherEntity;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository.generic.GenericRepositoryAdapter;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherRepositoryAdapter extends GenericRepositoryAdapter<Teacher, TeacherEntity> {
    public TeacherRepositoryAdapter(TeacherJpaRepository teacherJpaRepository) {
        super(teacherJpaRepository, new TeacherPersistanceMapper());
    }
}

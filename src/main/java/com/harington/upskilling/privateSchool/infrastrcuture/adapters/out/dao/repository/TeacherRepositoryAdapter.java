package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository;

import com.harington.upskilling.privateSchool.application.domain.model.Teacher;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model.TeacherEntity;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherRepositoryAdapter extends JpaRepositoryAdapter<Teacher, TeacherEntity, TeacherJpaRepository> {
    public TeacherRepositoryAdapter(TeacherJpaRepository teacherJpaRepository) {
        super(teacherJpaRepository);
    }
}

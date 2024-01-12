package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository;

import com.harington.upskilling.privateSchool.application.domain.model.Student;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.mapper.StudentPersistenceMapper;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model.StudentEntity;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository.generic.GenericRepositoryAdapter;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositoryAdapter extends GenericRepositoryAdapter<Student, StudentEntity> {
    public StudentRepositoryAdapter(StudentJpaRepository studentJpaRepository) {
        super(studentJpaRepository, new StudentPersistenceMapper());
    }
}

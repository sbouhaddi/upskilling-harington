package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository;

import com.harington.upskilling.privateSchool.application.domain.model.Student;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model.StudentEntity;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositoryAdapter extends JpaRepositoryAdapter<Student, StudentEntity, StudentJpaRepository> {
    public StudentRepositoryAdapter(StudentJpaRepository studentJpaRepository) {
        super(studentJpaRepository);
    }
}

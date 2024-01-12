package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository;

import com.harington.upskilling.privateSchool.application.domain.model.Subject;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model.SubjectEntity;
import org.springframework.stereotype.Repository;

@Repository
public class SubjectRepositoryAdapter extends JpaRepositoryAdapter<Subject, SubjectEntity, SubjectJpaRepository> {
    public SubjectRepositoryAdapter(SubjectJpaRepository subjectJpaRepository) {
        super(subjectJpaRepository);
    }
}

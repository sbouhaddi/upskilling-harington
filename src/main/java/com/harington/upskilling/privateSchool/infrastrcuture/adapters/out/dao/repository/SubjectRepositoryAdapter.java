package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository;

import com.harington.upskilling.privateSchool.application.domain.model.Subject;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.mapper.SubjectPersistanceMapper;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model.SubjectEntity;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository.generic.GenericRepositoryAdapter;
import org.springframework.stereotype.Repository;

@Repository
public class SubjectRepositoryAdapter extends GenericRepositoryAdapter<Subject, SubjectEntity> {
    public SubjectRepositoryAdapter(SubjectJpaRepository subjectJpaRepository) {
        super(subjectJpaRepository, new SubjectPersistanceMapper());
    }
}

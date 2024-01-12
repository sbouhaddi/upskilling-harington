package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository;

import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model.StudentEntity;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository.generic.GenericJpaRepository;

public interface StudentJpaRepository extends GenericJpaRepository<StudentEntity, Long> {}

package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository;

import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model.ClasseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClasseJpaRepository extends JpaRepository<ClasseEntity, Long> {}

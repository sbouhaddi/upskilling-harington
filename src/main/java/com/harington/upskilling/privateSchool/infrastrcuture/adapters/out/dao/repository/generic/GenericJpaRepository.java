package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository.generic;

import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model.DataModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericJpaRepository<E extends DataModel, ID> extends JpaRepository<E, ID> {}

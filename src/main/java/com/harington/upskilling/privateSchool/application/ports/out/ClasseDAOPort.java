package com.harington.upskilling.privateSchool.application.ports.out;

import com.harington.upskilling.privateSchool.application.domain.model.Classe;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasseDAOPort extends DomainDAOPort<Classe> {}

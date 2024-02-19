package com.harington.upskilling.privateSchool.domain.service;

import com.harington.upskilling.privateSchool.application.ports.in.ClasseUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateClasseRequest;
import com.harington.upskilling.privateSchool.application.ports.in.data.UpdateClasseRequest;
import com.harington.upskilling.privateSchool.application.ports.out.DomainDAOPort;
import com.harington.upskilling.privateSchool.domain.model.Classe;

public class ClasseService extends GenericService<Classe, CreateClasseRequest, UpdateClasseRequest>
        implements ClasseUseCase {

    public ClasseService(DomainDAOPort<Classe> domainDAOPort) {
        super(domainDAOPort);
    }
}

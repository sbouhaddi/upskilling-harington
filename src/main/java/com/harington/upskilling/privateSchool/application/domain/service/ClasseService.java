package com.harington.upskilling.privateSchool.application.domain.service;

import com.harington.upskilling.privateSchool.application.domain.model.Classe;
import com.harington.upskilling.privateSchool.application.ports.in.ClasseUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateClasseRequest;
import com.harington.upskilling.privateSchool.application.ports.in.data.UpdateClasseRequest;
import com.harington.upskilling.privateSchool.application.ports.out.DomainDAOPort;

public class ClasseService extends GenericService<Classe, CreateClasseRequest, UpdateClasseRequest>
        implements ClasseUseCase {

    public ClasseService(DomainDAOPort<Classe> domainDAOPort) {
        super(domainDAOPort);
    }
}

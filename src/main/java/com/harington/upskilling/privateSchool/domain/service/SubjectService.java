package com.harington.upskilling.privateSchool.domain.service;

import com.harington.upskilling.privateSchool.application.ports.in.SubjectUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateSubjectRequest;
import com.harington.upskilling.privateSchool.application.ports.in.data.UpdateSubjectRequest;
import com.harington.upskilling.privateSchool.application.ports.out.DomainDAOPort;
import com.harington.upskilling.privateSchool.domain.model.Subject;

public class SubjectService extends GenericService<Subject, CreateSubjectRequest, UpdateSubjectRequest>
        implements SubjectUseCase {

    public SubjectService(DomainDAOPort<Subject> domainDAOPort) {
        super(domainDAOPort);
    }
}

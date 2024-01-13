package com.harington.upskilling.privateSchool.domain.service;

import com.harington.upskilling.privateSchool.application.ports.in.TeacherUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateTeacherRequest;
import com.harington.upskilling.privateSchool.application.ports.in.data.UpdateTeacherRequest;
import com.harington.upskilling.privateSchool.application.ports.out.DomainDAOPort;
import com.harington.upskilling.privateSchool.domain.model.Teacher;

public class TeacherService extends GenericService<Teacher, CreateTeacherRequest, UpdateTeacherRequest>
        implements TeacherUseCase {

    public TeacherService(DomainDAOPort<Teacher> domainDAOPort) {
        super(domainDAOPort);
    }
}

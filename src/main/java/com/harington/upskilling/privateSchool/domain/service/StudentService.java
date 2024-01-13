package com.harington.upskilling.privateSchool.domain.service;

import com.harington.upskilling.privateSchool.domain.model.Student;
import com.harington.upskilling.privateSchool.application.ports.in.StudentUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateStudentRequest;
import com.harington.upskilling.privateSchool.application.ports.in.data.UpdateStudentRequest;
import com.harington.upskilling.privateSchool.application.ports.out.DomainDAOPort;

public class StudentService extends GenericService<Student, CreateStudentRequest, UpdateStudentRequest> implements StudentUseCase {

    public StudentService(DomainDAOPort<Student> domainDAOPort) {
        super(domainDAOPort);
    }
}

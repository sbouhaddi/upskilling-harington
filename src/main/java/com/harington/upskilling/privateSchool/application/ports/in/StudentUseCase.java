package com.harington.upskilling.privateSchool.application.ports.in;

import com.harington.upskilling.privateSchool.domain.model.Student;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateStudentRequest;
import com.harington.upskilling.privateSchool.application.ports.in.data.UpdateStudentRequest;
import com.harington.upskilling.privateSchool.application.ports.in.generics.CrudUseCase;

public interface StudentUseCase extends CrudUseCase<Student, CreateStudentRequest, UpdateStudentRequest> {}

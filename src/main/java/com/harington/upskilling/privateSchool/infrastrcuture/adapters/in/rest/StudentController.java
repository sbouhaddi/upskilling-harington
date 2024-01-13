package com.harington.upskilling.privateSchool.infrastrcuture.adapters.in.rest;

import com.harington.upskilling.privateSchool.application.ports.in.StudentUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateStudentRequest;
import com.harington.upskilling.privateSchool.application.ports.in.data.UpdateStudentRequest;
import com.harington.upskilling.privateSchool.domain.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/students")
public class StudentController extends GenericRestController<Student, CreateStudentRequest, UpdateStudentRequest> {

    public StudentController(StudentUseCase studentUseCase) {
        super(studentUseCase);
    }
}

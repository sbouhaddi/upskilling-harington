package com.harington.upskilling.privateSchool.infrastrcuture.adapters.in.rest;

import com.harington.upskilling.privateSchool.application.domain.model.Teacher;
import com.harington.upskilling.privateSchool.application.ports.in.TeacherUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateTeacherRequest;
import com.harington.upskilling.privateSchool.application.ports.in.data.UpdateTeacherRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/teachers")
public class TeacherController extends GenericRestController<Teacher, CreateTeacherRequest, UpdateTeacherRequest> {

    public TeacherController(TeacherUseCase teacherUseCase) {
        super(teacherUseCase);
    }
}

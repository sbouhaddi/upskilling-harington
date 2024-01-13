package com.harington.upskilling.privateSchool.application.ports.in;

import com.harington.upskilling.privateSchool.application.ports.in.data.CreateTeacherRequest;
import com.harington.upskilling.privateSchool.application.ports.in.data.UpdateTeacherRequest;
import com.harington.upskilling.privateSchool.application.ports.in.generics.CrudUseCase;
import com.harington.upskilling.privateSchool.domain.model.Teacher;

public interface TeacherUseCase extends CrudUseCase<Teacher, CreateTeacherRequest, UpdateTeacherRequest> {}

package com.harington.upskilling.privateSchool.application.ports.in;

import com.harington.upskilling.privateSchool.domain.model.Subject;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateSubjectRequest;
import com.harington.upskilling.privateSchool.application.ports.in.data.UpdateSubjectRequest;
import com.harington.upskilling.privateSchool.application.ports.in.generics.CrudUseCase;

public interface SubjectUseCase extends CrudUseCase<Subject, CreateSubjectRequest, UpdateSubjectRequest> {}

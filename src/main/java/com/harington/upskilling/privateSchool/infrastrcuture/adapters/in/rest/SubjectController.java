package com.harington.upskilling.privateSchool.infrastrcuture.adapters.in.rest;

import com.harington.upskilling.privateSchool.application.domain.model.Subject;
import com.harington.upskilling.privateSchool.application.ports.in.SubjectUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateSubjectRequest;
import com.harington.upskilling.privateSchool.application.ports.in.data.UpdateSubjectRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/subjects")
public class SubjectController extends GenericRestController<Subject, CreateSubjectRequest, UpdateSubjectRequest> {

    public SubjectController(SubjectUseCase subjectUseCase) {
        super(subjectUseCase);
    }
}

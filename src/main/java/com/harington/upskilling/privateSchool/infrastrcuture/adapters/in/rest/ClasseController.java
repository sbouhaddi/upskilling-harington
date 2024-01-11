package com.harington.upskilling.privateSchool.infrastrcuture.adapters.in.rest;

import com.harington.upskilling.privateSchool.application.domain.model.Classe;
import com.harington.upskilling.privateSchool.application.ports.in.ClasseUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.data.CreateClasseRequest;
import com.harington.upskilling.privateSchool.application.ports.in.data.UpdateClasseRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/classes")
public class ClasseController extends GenericRestController<Classe, CreateClasseRequest, UpdateClasseRequest> {

    @Autowired
    public ClasseController(ClasseUseCase classeUseCase) {
        super(classeUseCase);
    }
}

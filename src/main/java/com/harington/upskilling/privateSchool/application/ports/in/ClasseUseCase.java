package com.harington.upskilling.privateSchool.application.ports.in;

import com.harington.upskilling.privateSchool.application.ports.in.data.CreateClasseRequest;
import com.harington.upskilling.privateSchool.application.ports.in.data.UpdateClasseRequest;
import com.harington.upskilling.privateSchool.application.ports.in.generics.CrudUseCase;
import com.harington.upskilling.privateSchool.domain.model.Classe;

public interface ClasseUseCase extends CrudUseCase<Classe, CreateClasseRequest, UpdateClasseRequest> {}

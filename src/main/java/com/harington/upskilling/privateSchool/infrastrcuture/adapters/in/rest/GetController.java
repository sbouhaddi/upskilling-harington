package com.harington.upskilling.privateSchool.infrastrcuture.adapters.in.rest;

import com.harington.upskilling.privateSchool.application.domain.model.DomainModel;
import com.harington.upskilling.privateSchool.application.ports.in.generics.GetUseCase;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

public abstract class GetController<S extends GetUseCase<T>, T extends DomainModel> {

    private S getUseCase;

    public GetController(S getUseCase) {
        this.getUseCase = getUseCase;
    }

    @GetMapping("/{id}")
    public T get(long id) {
        return getUseCase.get(id);
    }

    @GetMapping("")
    public List<T> getAll() {
        return getUseCase.getAll();
    }
}

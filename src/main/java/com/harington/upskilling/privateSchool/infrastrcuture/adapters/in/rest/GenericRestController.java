package com.harington.upskilling.privateSchool.infrastrcuture.adapters.in.rest;

import com.harington.upskilling.privateSchool.application.domain.model.DomainModel;
import com.harington.upskilling.privateSchool.application.ports.in.generics.CreateRequest;
import com.harington.upskilling.privateSchool.application.ports.in.generics.CrudUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.generics.UpdateRequest;
import java.net.URI;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

public class GenericRestController<T extends DomainModel, C extends CreateRequest<T>, U extends UpdateRequest<T>> {

    private final CrudUseCase<T, C, U> crudUseCase;

    public GenericRestController(CrudUseCase<T, C, U> crudUseCase) {
        this.crudUseCase = crudUseCase;
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<?> save(@RequestBody C createRequest) {
        T t = crudUseCase.create(createRequest);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(t.id())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        crudUseCase.delete(id);
    }

    @GetMapping("/{id}")
    public T get(@PathVariable("id") long id) {
        return crudUseCase.get(id);
    }

    @GetMapping("")
    public List<T> getAll() {
        return crudUseCase.getAll();
    }

    public void update(@PathVariable("id") long id, @RequestBody U updateClasseRequest) {
        crudUseCase.update(id, updateClasseRequest);
    }
}

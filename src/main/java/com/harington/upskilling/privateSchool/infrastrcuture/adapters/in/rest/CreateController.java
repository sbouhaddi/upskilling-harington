package com.harington.upskilling.privateSchool.infrastrcuture.adapters.in.rest;

import com.harington.upskilling.privateSchool.application.domain.model.DomainModel;
import com.harington.upskilling.privateSchool.application.ports.in.generics.CreateRequest;
import com.harington.upskilling.privateSchool.application.ports.in.generics.CreateUseCase;
import java.net.URI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

public class CreateController<S extends CreateUseCase<C, T>, T extends DomainModel, C extends CreateRequest<T>> {

    private S createUseCse;

    public CreateController(S useCse) {
        this.createUseCse = useCse;
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<?> save(@RequestBody C createRequest) {
        T t = createUseCse.create(createRequest);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(t.id())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}

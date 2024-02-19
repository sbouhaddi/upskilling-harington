package com.harington.upskilling.privateSchool.domain.service;

import com.harington.upskilling.privateSchool.application.ports.in.generics.CreateRequest;
import com.harington.upskilling.privateSchool.application.ports.in.generics.UpdateRequest;
import com.harington.upskilling.privateSchool.application.ports.out.DomainDAOPort;
import com.harington.upskilling.privateSchool.domain.model.DomainModel;
import java.util.List;

public class GenericService<T extends DomainModel, C extends CreateRequest<T>, U extends UpdateRequest<T>> {
    private final DomainDAOPort<T> domainDAOPort;

    public GenericService(DomainDAOPort<T> domainDAOPort) {
        this.domainDAOPort = domainDAOPort;
    }

    public List<T> getAll() {
        return domainDAOPort.getAll();
    }

    public T get(long id) {
        return domainDAOPort.get(id);
    }

    public void delete(long id) {
        domainDAOPort.delete(id);
    }

    public T update(long id, U updateRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    public T create(C createRequest) {
        return domainDAOPort.save(createRequest.toDomainModel());
    }
}

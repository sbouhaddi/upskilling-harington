package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository.generic;

import com.harington.upskilling.privateSchool.application.domain.model.DomainModel;
import com.harington.upskilling.privateSchool.application.ports.out.DomainDAOPort;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.mapper.PersistanceMapper;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model.DataModel;
import java.util.List;

public class GenericRepositoryAdapter<T extends DomainModel, E extends DataModel<T>> implements DomainDAOPort<T> {

    private GenericJpaRepository genericJpaRepository;
    private final PersistanceMapper<T, E> mapper;

    public GenericRepositoryAdapter(
            GenericJpaRepository<E, Long> genericJpaRepository, PersistanceMapper<T, E> mapper) {
        this.genericJpaRepository = genericJpaRepository;
        this.mapper = mapper;
    }

    @Override
    public T save(T data) {
        E entity = (E) genericJpaRepository.save(mapper.toPersistanceEntity(data));
        return mapper.toDomainModel(entity);
    }

    @Override
    public void delete(long id) {
        genericJpaRepository.deleteById(id);
    }

    @Override
    public T get(long id) {
        E entity = (E) genericJpaRepository.findById(id).get();
        return mapper.toDomainModel(entity);
    }

    @Override
    public List<T> getAll() {
        return genericJpaRepository.findAll();
    }

    @Override
    public void update(long id, T data) {
        T e = get(id);
        save(e);
    }
}

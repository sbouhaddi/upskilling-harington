package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository;

import com.harington.upskilling.privateSchool.application.domain.exceptions.RecordNotFoundException;
import com.harington.upskilling.privateSchool.application.domain.model.DomainModel;
import com.harington.upskilling.privateSchool.application.ports.out.DomainDAOPort;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model.DataModel;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.data.jpa.repository.JpaRepository;

public class JpaRepositoryAdapter<T extends DomainModel, E extends DataModel<T>, R extends JpaRepository<E, Long>>
        implements DomainDAOPort<T> {

    R repository;

    public JpaRepositoryAdapter(R r) {
        this.repository = r;
    }

    @Override
    public T get(long id) {
        E entity = repository.findById(id).orElseThrow(() -> new RecordNotFoundException("Entity not found"));
        return entity.toDomaimModel();
    }

    @Override
    public List<T> getAll() {

        List<E> entities = repository.findAll();
        List<T> domainObjects = entities.stream().map(E::toDomaimModel).collect(Collectors.toList());
        return domainObjects;
    }

    @Override
    public void save(T data) {
        E entity = createEntityFromData(data);
        repository.save(entity);
    }

    @Override
    public void update(long id, T data) {}

    @Override
    public void delete(long id) {}

    private E createEntityFromData(T data) {
        try {
            E entity = (E) data.getClass().getDeclaredMethod("toEntity").invoke(data);
            return entity;
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert data to entity", e);
        }
    }
}

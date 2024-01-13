package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.mapper;

public interface PersistanceMapper<T, E> {
    T toDomainModel(E entity);

    E toPersistanceEntity(T model);
}

package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.repository;

import java.util.List;

public interface CrudRepository<T> {

    T get(long id);

    List<T> getAll();

    void save(T data);

    void update(T data);
}

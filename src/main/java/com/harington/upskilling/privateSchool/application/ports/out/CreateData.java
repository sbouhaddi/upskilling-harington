package com.harington.upskilling.privateSchool.application.ports.out;

import com.harington.upskilling.privateSchool.application.domain.model.DomainModel;

public interface CreateData<T extends DomainModel> {
    void save(T data);
}

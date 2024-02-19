package com.harington.upskilling.privateSchool.application.ports.out;

import com.harington.upskilling.privateSchool.domain.model.DomainModel;
import java.util.List;

public interface GetData<T extends DomainModel> {

    T get(long id);

    List<T> getAll();
}

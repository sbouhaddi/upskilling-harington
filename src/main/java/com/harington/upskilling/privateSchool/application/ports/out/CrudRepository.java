package com.harington.upskilling.privateSchool.application.ports.out;

import com.harington.upskilling.privateSchool.application.domain.model.DomainModel;

public interface CrudRepository<T extends DomainModel> extends GetData<T>, CreateData<T>, UpdateData<T>, DeletedData {}

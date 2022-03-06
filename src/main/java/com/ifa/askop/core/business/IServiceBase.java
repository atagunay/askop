package com.ifa.askop.core.business;

import com.ifa.askop.core.entity.IEntity;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.IResult;

import java.util.List;

public interface IServiceBase<T extends IEntity> {
    DataResult<List<T>> getAll();

    IResult add(T t);

    IResult update(T t);

    IResult delete(T t);

    DataResult<T> getById(Integer id);

}

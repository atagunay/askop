package com.ifa.askop.core.controller;

import com.ifa.askop.core.entity.IEntity;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.IResult;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IBaseController <T extends IEntity>{

    public ResponseEntity<IResult> addEntity (T entity);

    public ResponseEntity<DataResult<List<T>>> getAll();

    public ResponseEntity<DataResult<T>> getById(int id);

    public ResponseEntity<IResult> updateEntity(T entity);

    public ResponseEntity<IResult> deleteEntity(T entity);
}

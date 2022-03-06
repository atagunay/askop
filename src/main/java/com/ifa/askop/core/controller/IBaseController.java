package com.ifa.askop.core.controller;

import com.ifa.askop.core.entity.IEntity;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.IResult;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IBaseController <T extends IEntity>{

     ResponseEntity<IResult> addEntity (T entity);

     ResponseEntity<DataResult<List<T>>> getAll();

     ResponseEntity<DataResult<T>> getById(int id);

     ResponseEntity<IResult> updateEntity(T entity);

     ResponseEntity<IResult> deleteEntity(T entity);
}

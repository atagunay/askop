package com.ifa.askop.core.utilities.controller;

import com.ifa.askop.core.entity.IEntity;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.IResult;
import com.ifa.askop.entity.model.Player;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IBaseController <T extends IEntity>{

    public ResponseEntity<IResult> addEntity (T entity);

    public ResponseEntity<DataResult<List<T>>> getAll();

    public ResponseEntity<DataResult<T>> getById(int id);

    public ResponseEntity<IResult> updateEntity(T entity);

    public ResponseEntity<IResult> deleteEntity(T entity);
}

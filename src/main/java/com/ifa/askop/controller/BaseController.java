package com.ifa.askop.controller;

import com.ifa.askop.core.entity.IEntity;
import com.ifa.askop.core.utilities.business.IServiceBase;
import com.ifa.askop.core.utilities.controller.IBaseController;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.IResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BaseController<T extends IEntity, S extends IServiceBase<T>> implements IBaseController<T> {

    private final IServiceBase<T> serviceBase;

    public BaseController(S serviceBase) {
        this.serviceBase = serviceBase;
    }

    @Override
    @GetMapping("/getall")
    public ResponseEntity<DataResult<List<T>>> getAll() {
        return ResponseEntity.ok(serviceBase.getAll());
    }

    @Override
    @GetMapping("/getById")
    public ResponseEntity<DataResult<T>> getById(@RequestParam int id) {
        return ResponseEntity.ok(serviceBase.getById(id));
    }

    @Override
    @PutMapping("/update")
    public ResponseEntity<IResult> updateEntity(@RequestBody T entity) {
        return ResponseEntity.ok(serviceBase.update(entity));
    }

    @Override
    @DeleteMapping("/delete")
    public ResponseEntity<IResult> deleteEntity(@RequestBody T entity) {
        return ResponseEntity.ok(serviceBase.delete(entity));
    }
}

package com.ifa.askop.controller;

import com.ifa.askop.core.entity.IEntity;
import com.ifa.askop.core.utilities.business.IServiceBase;
import com.ifa.askop.core.utilities.controller.IBaseController;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.ErrorDataResult;
import com.ifa.askop.core.utilities.results.IResult;
import com.ifa.askop.entity.model.Player;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
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
        var result = serviceBase.getAll();
        if(result.isSuccess()){
            return new ResponseEntity<DataResult<List<T>>>(result,HttpStatus.OK);
        }

        return new ResponseEntity<DataResult<List<T>>>(new ErrorDataResult(result.getMessage()),
        HttpStatus.BAD_REQUEST);

    }

    @Override
    @GetMapping("/getById")
    public ResponseEntity<DataResult<T>> getById(@RequestParam int id) {
        var result = serviceBase.getById(id);
        if(result.isSuccess()){
            return new ResponseEntity<DataResult<T>>(result,HttpStatus.OK);
        }

        return new ResponseEntity<DataResult<T>>(new ErrorDataResult(result.getMessage()),
                HttpStatus.BAD_REQUEST);

    }

    @Override
    @PutMapping("/update")
    public ResponseEntity<IResult> updateEntity(@RequestBody T entity) {
        var result = serviceBase.update(entity);
        if(result.isSuccess()){
            return new ResponseEntity<IResult>(result,HttpStatus.OK);
        }

        return new ResponseEntity<IResult>(new ErrorDataResult(result.getMessage()),
                HttpStatus.BAD_REQUEST);
    }

    @Override
    @DeleteMapping("/delete")
    public ResponseEntity<IResult> deleteEntity(@RequestBody T entity) {
        var result = serviceBase.delete(entity);
        if(result.isSuccess()){
            return new ResponseEntity<IResult>(result,HttpStatus.OK);
        }

        return new ResponseEntity<IResult>(new ErrorDataResult(result.getMessage()),
                HttpStatus.BAD_REQUEST);
    }

    @Override
    @PostMapping("/add")
    public ResponseEntity<IResult> addEntity(@RequestBody T entity) {
        var result = serviceBase.add(entity);
        if(result.isSuccess()){
            return new ResponseEntity<IResult>(result,HttpStatus.OK);
        }

        return new ResponseEntity<IResult>(new ErrorDataResult(result.getMessage()),
                HttpStatus.BAD_REQUEST);
    }
}

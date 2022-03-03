package com.ifa.askop.controller;

import com.ifa.askop.core.entity.IEntity;
import com.ifa.askop.core.utilities.business.IServiceBase;
import com.ifa.askop.core.utilities.controller.IBaseController;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.IResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BaseController<T extends IEntity> implements IBaseController<T> {

    private final IServiceBase<T> serviceBase;

    public BaseController(IServiceBase<T> serviceBase) {
        this.serviceBase = serviceBase;
    }

    @Override
    @GetMapping("/getall")
    public ResponseEntity<DataResult<List<T>>> getAll() {
        return ResponseEntity.ok(serviceBase.getAll());
    }

    @Override
    @GetMapping("/getById")
    public ResponseEntity<DataResult<T>> getbyId(@RequestParam int playerId) {
        return ResponseEntity.ok(serviceBase.getById(playerId));
    }

    @Override
    @PutMapping("/update")
    public ResponseEntity<IResult> updatePlayer(@RequestBody T player) {
        return ResponseEntity.ok(serviceBase.update(player));
    }

    @Override
    @DeleteMapping("/delete")
    public ResponseEntity<IResult> deletePlayer(@RequestBody T player) {
        return ResponseEntity.ok(serviceBase.delete(player));
    }
}

package com.ifa.askop.core.utilities.controller;

import com.ifa.askop.core.entity.IEntity;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.IResult;
import com.ifa.askop.entity.model.Player;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IBaseController <T extends IEntity>{

    public ResponseEntity<DataResult<List<T>>> getAll();

    public ResponseEntity<DataResult<T>> getbyId(int playerId);

    public ResponseEntity<IResult> updatePlayer(T player);

    public ResponseEntity<IResult> deletePlayer(T player);
}

package com.ifa.askop.controller;

import com.ifa.askop.business.Abstract.IPlayerService;
import com.ifa.askop.core.utilities.results.DataResult;
import com.ifa.askop.core.utilities.results.IResult;
import com.ifa.askop.core.utilities.results.Result;
import com.ifa.askop.core.utilities.results.SuccessResult;
import com.ifa.askop.entity.model.Player;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/player")
@AllArgsConstructor
public class PlayerController{

    private final IPlayerService playerService;

    @GetMapping("/getall")
    public DataResult<List<Player>> createPlayer(){
        return playerService.getAll();
    }

    @GetMapping("/{playerId}")
    public DataResult<Player> getbyId(@PathVariable int playerId){
        return playerService.getById(playerId);
    }

    @PutMapping("/update")
    public IResult updatePlayer(@RequestBody Player player){
        return playerService.update(player);
    }

    @DeleteMapping("/delete/{playerId}")
    public IResult deletePlayer(@PathVariable int playerId){
        return playerService.delete(playerId);
    }

}

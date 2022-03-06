package com.ifa.askop.controller;

import com.ifa.askop.business.Abstract.IPlayerService;
import com.ifa.askop.core.controller.BaseController;
import com.ifa.askop.entity.model.Player;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/player")
public class PlayerController extends BaseController<Player,IPlayerService> {

    public PlayerController(IPlayerService serviceBase) {
        super(serviceBase);
    }
}

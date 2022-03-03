package com.ifa.askop.controller;

import com.ifa.askop.business.Abstract.IPlayerService;
import com.ifa.askop.core.utilities.business.IServiceBase;
import com.ifa.askop.core.utilities.controller.IBaseController;
import com.ifa.askop.core.utilities.results.*;
import com.ifa.askop.entity.model.Player;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/player")
public class PlayerController extends BaseController<Player,IPlayerService> {

    public PlayerController(IPlayerService serviceBase) {
        super(serviceBase);
    }
}

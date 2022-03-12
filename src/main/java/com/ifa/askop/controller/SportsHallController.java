package com.ifa.askop.controller;

import com.ifa.askop.business.concrete.SportsHallManager;
import com.ifa.askop.core.controller.BaseController;
import com.ifa.askop.entity.model.SportsHall;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/sportsHall")
public class SportsHallController extends BaseController<SportsHall, SportsHallManager> {

    public SportsHallController(SportsHallManager serviceBase) {
        super(serviceBase);
    }
}

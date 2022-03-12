package com.ifa.askop.controller;

import com.ifa.askop.business.concrete.TeamManager;
import com.ifa.askop.core.controller.BaseController;
import com.ifa.askop.entity.model.Team;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/team")
public class TeamController extends BaseController<Team, TeamManager> {

    public TeamController(TeamManager serviceBase) {
        super(serviceBase);
    }
}

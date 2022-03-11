package com.ifa.askop.controller;

import com.ifa.askop.business.concrete.DueInfoManager;
import com.ifa.askop.core.controller.BaseController;
import com.ifa.askop.entity.model.DueInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/dueInfo")
public class DueInfoController extends BaseController<DueInfo, DueInfoManager> {

    public DueInfoController(DueInfoManager dueInfoManager){
        super(dueInfoManager);
    }
}

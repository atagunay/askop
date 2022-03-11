package com.ifa.askop.controller;

import com.ifa.askop.business.concrete.DueManager;
import com.ifa.askop.core.business.IServiceBase;
import com.ifa.askop.core.controller.BaseController;
import com.ifa.askop.entity.model.Due;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
@RequestMapping("/v1/due")
public class DueController extends BaseController<Due, DueManager> {

    public DueController(DueManager serviceBase) {
        super(serviceBase);
    }
}

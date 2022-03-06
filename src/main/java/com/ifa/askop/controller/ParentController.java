package com.ifa.askop.controller;

import com.ifa.askop.business.Concrete.ParentManager;
import com.ifa.askop.core.controller.BaseController;
import com.ifa.askop.entity.model.Parent;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/parent")
public class ParentController extends BaseController<Parent, ParentManager> {

    public ParentController(ParentManager serviceBase) {
        super(serviceBase);
    }
}

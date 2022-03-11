package com.ifa.askop.controller;

import com.ifa.askop.business.concrete.AssignmentManagerService;
import com.ifa.askop.core.controller.BaseController;
import com.ifa.askop.entity.model.Assignment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/assignment")
public class AssignmentController extends BaseController<Assignment, AssignmentManagerService> {

    public AssignmentController(AssignmentManagerService serviceBase) {
        super(serviceBase);
    }
}

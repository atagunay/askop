package com.ifa.askop.controller;

import com.ifa.askop.business.concrete.BranchManagerService;
import com.ifa.askop.core.controller.BaseController;
import com.ifa.askop.entity.model.Branch;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/branch")
public class BranchController extends BaseController<Branch, BranchManagerService> {

    public BranchController(BranchManagerService serviceBase) {
        super(serviceBase);
    }
}

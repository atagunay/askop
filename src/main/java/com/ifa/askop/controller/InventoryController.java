package com.ifa.askop.controller;

import com.ifa.askop.business.concrete.InventoryManager;
import com.ifa.askop.core.controller.BaseController;
import com.ifa.askop.entity.model.Inventory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/inventory")
public class InventoryController extends BaseController<Inventory, InventoryManager> {

    public InventoryController(InventoryManager serviceBase) {
        super(serviceBase);
    }
}

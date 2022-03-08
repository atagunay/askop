package com.ifa.askop.controller;

import com.ifa.askop.business.Concrete.AnnouncementManager;
import com.ifa.askop.core.controller.BaseController;
import com.ifa.askop.entity.model.Announcement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/announcement")
public class AnnouncementController extends BaseController<Announcement, AnnouncementManager> {

    public AnnouncementController(AnnouncementManager serviceBase) {
        super(serviceBase);
    }
}

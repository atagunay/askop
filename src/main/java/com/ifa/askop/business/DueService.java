package com.ifa.askop.business;

import com.ifa.askop.repository.DueRepository;
import org.springframework.stereotype.Service;

@Service
public class DueService {

    private final DueRepository dueRepository;

    public DueService(DueRepository dueRepository) {
        this.dueRepository = dueRepository;
    }
}

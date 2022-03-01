package com.ifa.askop.business;

import com.ifa.askop.entity.model.Parent;
import com.ifa.askop.repository.ParentRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ParentService {

    private final ParentRepository parentRepository;

    public ParentService(ParentRepository parentRepository) {
        this.parentRepository = parentRepository;
    }

    protected Parent findParentById(int id){
        return parentRepository.findById(id).orElseThrow();
    }
}

package com.ifa.askop.repository;

import com.ifa.askop.entity.model.Due;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DueRepository extends JpaRepository<Due,Integer> {
}

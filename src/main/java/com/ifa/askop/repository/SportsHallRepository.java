package com.ifa.askop.repository;

import com.ifa.askop.entity.model.SportsHall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportsHallRepository extends JpaRepository<SportsHall, Integer> {
}

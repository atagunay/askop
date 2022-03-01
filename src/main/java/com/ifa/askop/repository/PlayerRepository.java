package com.ifa.askop.repository;

import com.ifa.askop.entity.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Integer> {
}

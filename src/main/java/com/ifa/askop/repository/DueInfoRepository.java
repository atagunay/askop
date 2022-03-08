package com.ifa.askop.repository;

import com.ifa.askop.entity.model.DueInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DueInfoRepository extends JpaRepository<DueInfo,Integer> {
}

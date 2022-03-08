package com.ifa.askop.repository;

import com.ifa.askop.entity.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch,Integer> {
}

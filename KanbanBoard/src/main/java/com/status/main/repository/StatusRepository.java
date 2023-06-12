package com.status.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.status.main.entity.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status , Integer> {

	
}

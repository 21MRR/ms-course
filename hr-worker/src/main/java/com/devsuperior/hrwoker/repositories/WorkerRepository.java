package com.devsuperior.hrwoker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hrwoker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}

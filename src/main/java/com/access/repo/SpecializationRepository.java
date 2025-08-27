package com.access.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.access.entity.Specialization;

//repo
public interface SpecializationRepository extends JpaRepository<Specialization, Long> {

}

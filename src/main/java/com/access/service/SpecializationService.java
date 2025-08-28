package com.access.service;

import java.util.List;

import com.access.entity.Specialization;

public interface SpecializationService {

	public Long saveSpecialization(Specialization spec);
	public List<Specialization> getAllSpecializations();
	public void removeSpecialization(Long id);
	public Specialization getOneSpecialization(Long id);
	public void updateSpecialization(Specialization spec);
	
}

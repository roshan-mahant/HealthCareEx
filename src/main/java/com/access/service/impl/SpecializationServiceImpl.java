package com.access.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.access.entity.Specialization;
import com.access.exception.SpecializationNotFoundException;
import com.access.repo.SpecializationRepository;
import com.access.service.SpecializationService;

@Service
public class SpecializationServiceImpl implements SpecializationService {
	
	@Autowired
	private SpecializationRepository specRepo;

	@Override
	public Long saveSpecialization(Specialization spec) {
		Specialization specobj = specRepo.save(spec);
		return specobj.getId();
	}

	@Override
	public List<Specialization> getAllSpecializations() {
		List<Specialization> list = specRepo.findAll();
		return list;
	}

	@Override
	public void removeSpecialization(Long id) {
		specRepo.delete(getOneSpecialization(id));

	}

	@Override
	public Specialization getOneSpecialization(Long id) {
		//Optional<Specialization> opt = specRepo.findById(id);
		
		/*
		if(opt.isEmpty()) {
			throw new SpecializationNotFoundException("Specialization "+id+" not present.");
		}else {
			return opt.get();//opt.orElseThrow( s => );
		}
		*/
		return specRepo.findById(id).orElseThrow(()-> new SpecializationNotFoundException("Specialization "+id+" not exist."));
	}

	@Override
	public void updateSpecialization(Specialization spec) {
		Long id = spec.getId();
		if(id != null && specRepo.existsById(id)) {
			specRepo.save(spec);
		}else {
			throw new SpecializationNotFoundException("Specialization "+id+" not exist.");
		}
	}

}

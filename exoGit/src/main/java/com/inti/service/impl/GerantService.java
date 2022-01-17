package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Gerant;
import com.inti.repositories.GerantRepository;
import com.inti.service.interfaces.IGerantService;

@Service
public class GerantService implements IGerantService{
	@Autowired
	GerantRepository gerantRepository;
	
	@Override
	public List<Gerant> findAll() {
		return gerantRepository.findAll();
	}

	@Override
	public Gerant findOne(Long idGerant) {
		return gerantRepository.findById(idGerant).get();
	}

	@Override
	public Gerant save(Gerant gerant) {
		return gerantRepository.save(gerant);
	}

	@Override
	public void delete(Long idGerant) {
		gerantRepository.deleteById(idGerant);
	}

}

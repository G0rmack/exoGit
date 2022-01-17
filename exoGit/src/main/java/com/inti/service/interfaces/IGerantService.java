package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Gerant;

public interface IGerantService {
	List<Gerant> findAll();
	Gerant findOne(Long idGerant);
	Gerant save (Gerant gerant);
	void delete (Long idGerant);
}

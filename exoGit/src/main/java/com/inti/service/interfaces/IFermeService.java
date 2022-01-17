package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Ferme;

public interface IFermeService {
	List<Ferme> findAll();
	Ferme findOne(Long idFerme);
	Ferme save (Ferme ferme);
	void delete (Long idFerme);
}

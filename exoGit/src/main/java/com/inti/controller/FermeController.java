package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inti.entities.Ferme;
import com.inti.service.interfaces.IFermeService;

@RestController
@CrossOrigin
public class FermeController {
	@Autowired
	IFermeService fermeService;

	@RequestMapping(value = "fermes", method = RequestMethod.GET)
	public List<Ferme> findAll() {
		return fermeService.findAll();
	}

	@RequestMapping(value = "fermes/{idF}", method = RequestMethod.GET)
	public Ferme findOne(@PathVariable("idF") Long idFerme) {
		return fermeService.findOne(idFerme);
	}
	
	@RequestMapping(value = "fermes", method = RequestMethod.POST)
	public Ferme saveFerme(@RequestBody Ferme ferme) {
		return fermeService.save(ferme);
	}

	@RequestMapping(value = "fermes/{idA}", method = RequestMethod.DELETE)
	public void deleteFerme(@PathVariable(value = "idF") Long idFerme) {
		fermeService.delete(idFerme);
	}

}

package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Gerant;
import com.inti.service.interfaces.IGerantService;

@RestController
@CrossOrigin
public class GerantController {

	@Autowired
	IGerantService gerantService;

	@RequestMapping(value = "gerants", method = RequestMethod.GET)
	public List<Gerant> findAll() {
		return gerantService.findAll();
	}

	@RequestMapping(value = "gerants/{idG}", method = RequestMethod.GET)
	public Gerant findOne(@PathVariable("idG") Long idGerant) {
		return gerantService.findOne(idGerant);
	}
	
	@RequestMapping(value = "gerants", method = RequestMethod.POST)
	public Gerant saveGerant(@RequestBody Gerant gerant) {
		return gerantService.save(gerant);
	}

	@RequestMapping(value = "gerants/{idG}", method = RequestMethod.DELETE)
	public void deleteGerant(@PathVariable(value = "idG") Long idGerant) {
		gerantService.delete(idGerant);
	}
}

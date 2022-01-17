package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inti.entities.Animal;
import com.inti.service.interfaces.IAnimalService;

@RestController
@CrossOrigin
public class AnimalController {
	@Autowired
	IAnimalService animalService;

	@RequestMapping(value = "animals", method = RequestMethod.GET)
	public List<Animal> findAll() {
		return animalService.findAll();
	}

	@RequestMapping(value = "animals/{idA}", method = RequestMethod.GET)
	public Animal findOne(@PathVariable("idA") Long idAnimal) {
		return animalService.findOne(idAnimal);
	}
	
	@RequestMapping(value = "animals", method = RequestMethod.POST)
	public Animal saveAnimal(@RequestBody Animal animal) {
		return animalService.save(animal);
	}

	@RequestMapping(value = "animals/{idA}", method = RequestMethod.DELETE)
	public void deleteAnimal(@PathVariable(value = "idA") Long idAnimal) {
		animalService.delete(idAnimal);
	}

}
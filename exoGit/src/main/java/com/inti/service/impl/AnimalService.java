package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Animal;
import com.inti.repositories.AnimalRepository;
import com.inti.service.interfaces.IAnimalService;

@Service
public class AnimalService implements IAnimalService{
	@Autowired
	AnimalRepository animalRepository;

	@Override
	public List<Animal> findAll() {
		return animalRepository.findAll();
	}

	@Override
	public Animal findOne(Long idAnimal) {
		return animalRepository.findById(idAnimal).get();
		// return animalRepository.getOne(idAnimal);
	}

	@Override
	public Animal save(Animal animal) {
		return animalRepository.save(animal);
	}

	@Override
	public void delete(Long idAnimal) {
		animalRepository.deleteById(idAnimal);		
	}
}

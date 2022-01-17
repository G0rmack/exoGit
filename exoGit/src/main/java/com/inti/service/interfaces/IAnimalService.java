package com.inti.service.interfaces;
import java.util.List;
import com.inti.entities.Animal;

public interface IAnimalService {
	List<Animal> findAll();
	Animal findOne(Long idAnimal);
	Animal save (Animal animal);
	void delete (Long idAnimal);
}

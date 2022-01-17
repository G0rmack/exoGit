package com.inti.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long>{

}

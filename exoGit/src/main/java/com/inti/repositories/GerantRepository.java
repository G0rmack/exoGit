package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Gerant;

@Repository
public interface GerantRepository extends JpaRepository<Gerant, Long>{

}

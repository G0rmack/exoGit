package com.inti.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Ferme;

@Repository
public interface FermeRepository extends JpaRepository<Ferme, Long>{

}

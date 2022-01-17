package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Animal implements Serializable {
	private Long idAnimal;

	@ManyToOne
	@JoinColumn(name = "id_ferme")
	private Ferme ferme;

	public Animal() {
	}

	public Animal(Ferme ferme) {
		this.ferme = ferme;
	}

	public Long getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(Long idAnimal) {
		this.idAnimal = idAnimal;
	}

	public Ferme getFerme() {
		return ferme;
	}

	public void setFerme(Ferme ferme) {
		this.ferme = ferme;
	}

}

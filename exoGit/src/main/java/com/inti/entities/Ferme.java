package com.inti.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ferme {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFerme;
	private String nom;
	private Date dateAchat;
	
	@OneToMany(mappedBy="ferme")
	private Set<Gerant> gerants = new HashSet();
	@OneToMany(mappedBy="animal")
	private Set<Animal> animaux = new HashSet();
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}
	public Set<Gerant> getGerants() {
		return gerants;
	}
	public void setGerants(Set<Gerant> gerants) {
		this.gerants = gerants;
	}
	public Set<Animal> getAnimaux() {
		return animaux;
	}
	public void setAnimaux(Set<Animal> animaux) {
		this.animaux = animaux;
	}
	public Ferme() {

	}
	public Ferme(String nom, Date dateAchat, Set<Gerant> gerants, Set<Animal> animaux) {
		super();
		this.nom = nom;
		this.dateAchat = dateAchat;
		this.gerants = gerants;
		this.animaux = animaux;
	}
	public Long getIdFerme() {
		return idFerme;
	}
	public void setIdFerme(Long idFerme) {
		this.idFerme = idFerme;
	}
	@Override
	public String toString() {
		return "Ferme [idFerme=" + idFerme + ", nom=" + nom + ", dateAchat=" + dateAchat + "]";
	}
	
	
}

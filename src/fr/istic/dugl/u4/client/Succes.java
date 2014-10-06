package fr.istic.dugl.u4.client;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Succes implements Serializable{
	private String nom;
	private int nbCoup;
	private String date;
		
	public Succes() {}
	
	public Succes(String nom, int nbCoup, String date) {
		this.nom = nom;
		this.nbCoup = nbCoup;
		this.date = date;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getNbCoup() {
		return nbCoup;
	}
	public void setNbCoup(int nbCoup) {
		this.nbCoup = nbCoup;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}

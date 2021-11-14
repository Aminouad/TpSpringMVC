package tn.enig.model;

public class Employe {
private int id;
private String nom;
private String fonction;
public Employe() {
	super();
}

public Employe(int id, String nom, String fonction, Departement departement, Projet projet) {
	super();
	this.id = id;
	this.nom = nom;
	this.fonction = fonction;
	this.departement = departement;
	this.projet = projet;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getFonction() {
	return fonction;
}
public void setFonction(String fonction) {
	this.fonction = fonction;
}
public Departement getDepartement() {
	return departement;
}
public void setDepartement(Departement departement) {
	this.departement = departement;
}
public Projet getProjet() {
	return projet;
}
public void setProjet(Projet projet) {
	this.projet = projet;
}

private Departement departement;
private Projet projet;

}

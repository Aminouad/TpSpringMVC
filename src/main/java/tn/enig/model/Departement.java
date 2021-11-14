package tn.enig.model;

public class Departement {

	
	private int id;
	private String nom;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	@Override
	public String toString() {
		return "Departement [id=" + id + ", nom=" + nom + "]";
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Departement(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public Departement() {
		super();
	}
	
}

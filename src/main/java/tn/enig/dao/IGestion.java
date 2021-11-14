package tn.enig.dao;

import java.util.List;

import tn.enig.model.Departement;
import tn.enig.model.Employe;
import tn.enig.model.Projet;

public interface IGestion {
	public List<Departement> getAllDepartement();
	public List<Projet> getAllProjet(int id);
	public void addProjet(Projet p);
	public void addEmploye(Employe e);
	public Projet getProjetById(int id,Departement d);
	public Departement getDepartementById(int id);
	public List<Employe> getAllEmployeByDepartement(Departement d);
	public List<Projet> getAllAllProjet();
}

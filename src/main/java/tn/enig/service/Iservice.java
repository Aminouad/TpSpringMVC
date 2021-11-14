package tn.enig.service;

import java.util.List;


import tn.enig.model.Departement;
import tn.enig.model.Employe;
import tn.enig.model.Projet;
public interface Iservice {

	public List<Departement> getAllDepartement();
	public void addProjet(Projet p);
	public void addEmploye(Employe e);
	public Projet getProjetById(int id,Departement d);
	public Departement getDepartementById(int id);
	public List<Employe> getAllEmployeByDepartement(Departement d);
	public List<Projet> getAllProjet(int id);
	public List<Projet> getAllAllProjet();

	
}

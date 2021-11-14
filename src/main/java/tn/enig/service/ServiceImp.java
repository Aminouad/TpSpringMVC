package tn.enig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enig.dao.IGestion;
import tn.enig.model.Departement;
import tn.enig.model.Employe;
import tn.enig.model.Projet;

@Service
public class ServiceImp implements Iservice {

	@Autowired
	IGestion dao;
	
	public void setDao(IGestion dao) {
		this.dao = dao;
	}
	
	@Override
	public List<Departement> getAllDepartement() {
		// TODO Auto-generated method stub
		return dao.getAllDepartement();
	}

	@Override
	public void addProjet(Projet p) {
		// TODO Auto-generated method stub
		dao.addProjet(p);
	}

	@Override
	public void addEmploye(Employe e) {
		// TODO Auto-generated method stub
		dao.addEmploye(e);
	}

	@Override
	public Projet getProjetById(int id, Departement d) {
		// TODO Auto-generated method stub
		return dao.getProjetById(id, d);
	}

	@Override
	public Departement getDepartementById(int id) {
		// TODO Auto-generated method stub
		return dao.getDepartementById(id);
	}

	@Override
	public List<Employe> getAllEmployeByDepartement(Departement d) {
		// TODO Auto-generated method stub
		return dao.getAllEmployeByDepartement(d);
	}

	@Override
	public List<Projet> getAllProjet(int id) {
		// TODO Auto-generated method stub
		return dao.getAllProjet(id);
		
	}
	
	
	public List<Projet> getAllAllProjet() {
		return dao.getAllAllProjet();
	}

}

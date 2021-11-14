package tn.enig.controller;
import tn.enig.model.Departement;
import tn.enig.model.Employe;
import tn.enig.model.Projet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import tn.enig.service.Iservice;



@Controller
public class AppController {
	
	@Autowired
	Iservice service;
	
	
	public void setService(Iservice service) {
		this.service = service;
	}


	@GetMapping("/Departements")
	public String getDep(Model m) {
		List<Departement> liste= service.getAllDepartement();
		m.addAttribute("liste",liste);
		return "Departements";
	}
	@GetMapping("/addProjet")
	public String AddProj(Model m) {
		Projet p=new Projet();
		m.addAttribute("p",p);
		List<Departement> liste= service.getAllDepartement();
		m.addAttribute("liste",liste);
		return "FormAjoutProjet";
	}
	@PostMapping("/saveProjet")
	public String get3(Model m, @ModelAttribute("p") Projet p) {
		service.addProjet(p);
		return "redirect:/addProjet";
	}
	@GetMapping("/Projets/{num}")
	public String getPro(Model m,@PathVariable("num") int idD){
		Departement dep=new Departement();
		dep=service.getDepartementById(idD);
		List<Projet> liste= service.getAllProjet(idD);
		m.addAttribute("liste",liste);
		m.addAttribute("dep",dep);
		return "Projets";
	}
	
	
	
	
	@GetMapping("/addEmploye")
	public String AddEmp(Model m) {
        Employe e=new Employe();
        m.addAttribute("e",e);
		List<Departement> liste= service.getAllDepartement();
		m.addAttribute("liste",liste);
		List<Projet> listeProjet= service.getAllAllProjet();
		m.addAttribute("listeProjet",listeProjet);
		return "FormAjoutEmploye";
	}
	@PostMapping("/saveEmploye")
	public String get3(Model m, @ModelAttribute("e") Employe e) {
		service.addEmploye(e);
		return "redirect:/addProjet";
	}
	
	
	
	
}

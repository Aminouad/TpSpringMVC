package tn.enig.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import tn.enig.model.Departement;
import tn.enig.model.Employe;
import tn.enig.model.Projet;

@Repository
public class GestionImp implements IGestion {

	@Autowired
	@Qualifier("dataSource")
	DataSource data;

	public void setData(DataSource data) {
		this.data = data;
	}
	
	
	public void addProjet(Projet p) {
	
		try {
				
		Connection con=data.getConnection();
	    PreparedStatement pr=con.prepareStatement("insert into projet values(null,?,?,?)");
	    pr.setString(1,p.getTitre());
	    pr.setString(2,p.getEtat());
	    pr.setInt(3, p.getDepartement().getId());
	    pr.executeUpdate();
	    

	}
		
		catch (Exception e) {
		// TODO: handle exception
	}
		}
	
	
	public void addEmploye(Employe e) {
		
		try {
				
		Connection con=data.getConnection();
	    PreparedStatement pr=con.prepareStatement("insert into employe values(null,?,?,?,?)");
	    pr.setString(1,e.getNom());
	    pr.setString(2,e.getFonction());
	    pr.setInt(3,e.getDepartement().getId());
	    pr.setInt(4, e.getProjet().getId());
	    pr.executeUpdate();
	    

	}
		
		catch (Exception e1) {
			System.out.println("3an problem fi addEmploye");
	}
	}
		public List<Departement> getAllDepartement(){
			List<Departement> ld=null;
			try {
				
				ld=new ArrayList<Departement>();
				Connection con=data.getConnection();
				PreparedStatement pr=con.prepareStatement("select * from departement");
				ResultSet rs=pr.executeQuery();
				while(rs.next()) {
					Departement d=new Departement(rs.getInt("id"),rs.getString("nom"));
					ld.add(d);
				}
				
				
			} catch (Exception e2) {
				System.out.println("3an problem fi get all departement");
			}
			
			return ld;
			
		}
		
		
		public Projet getProjetById(int id,Departement d) {
			Projet p=null;
			try {
				
				Connection con=data.getConnection();
				PreparedStatement pr=con.prepareStatement("select * from projet where id="+id);
				ResultSet rs=pr.executeQuery();
				while(rs.next()) {
					 p=new Projet(rs.getInt("id"),rs.getString("titre"),rs.getString("etat"),d);
			                      } }
				
				catch (Exception e2) {
				// TODO: handle exception
			}
			return p;
		}
		
		public Departement getDepartementById(int id) {
			Departement d=null;
			try {
				
				Connection con=data.getConnection();
				PreparedStatement pr=con.prepareStatement("select * from departement where id="+id);
				ResultSet rs=pr.executeQuery();
				while(rs.next()) {
					 d=new Departement(rs.getInt("id"),rs.getString("nom"));
			                      } }
				
				catch (Exception e2) {
					System.out.println("mochkla getDepartementById");
			}
			return d;
		}
		public List<Employe> getAllEmployeByDepartement(Departement d){
			List<Employe> le=null;
			
			try {
				le=new ArrayList<Employe>();
				Connection con=data.getConnection();
				PreparedStatement pr=con.prepareStatement("select * from employe where idDep="+d.getId());
				ResultSet rs=pr.executeQuery();
				while(rs.next()) {
					Employe e=new Employe(rs.getInt("id"),rs.getString("nom"),rs.getString("fonction"),d,getProjetById(rs.getInt("idP"),d));
					le.add(e);
				}
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("mochkla getAllEmployeByDepartement");
			}
			return le;
		}


		@Override
		public List<Projet> getAllProjet(int id) {
			// TODO Auto-generated method stub
			List<Projet> lp=null;
			try {
				
				lp=new ArrayList<Projet>();
				Connection con=data.getConnection();
				PreparedStatement pr=con.prepareStatement("select * from projet where idDep="+id);
				ResultSet rs=pr.executeQuery();
				while(rs.next()) {
					Projet p=new Projet(rs.getInt("id"),rs.getString("titre"),rs.getString("etat"),getDepartementById(id));
					lp.add(p);
				}
				
				
			} catch (Exception e2) {
				System.out.println("3an problem fi get all projet");
			}
			
			return lp;
			
		}


		@Override
		public List<Projet> getAllAllProjet() {
			List<Projet> lp=null;
			try {
				
				lp=new ArrayList<Projet>();
				Connection con=data.getConnection();
				PreparedStatement pr=con.prepareStatement("select * from projet");
				ResultSet rs=pr.executeQuery();
				while(rs.next()) {
					Projet p=new Projet(rs.getInt("id"),rs.getString("titre"),rs.getString("etat"),getDepartementById(rs.getInt("idDep")));
					lp.add(p);
				}
				
				
			} catch (Exception e2) {
				System.out.println("3an problem fi get all projet");
			}
			
			return lp;
			
		}
		
		}
	
	
	


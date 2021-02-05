package com.ilkou.spring_mvc_demo.DAO;

import java.util.List;

import org.hibernate.Session;

public class ImpEtudiant implements EtudiantDao {

	public void addEtudiant(Etudiant E) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		 
		session.beginTransaction();

		session.save(E);
    
		session.getTransaction().commit();
	}

	public void deleteEtudiant(Long code) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		 
		session.beginTransaction();

		Etudiant cl = (Etudiant)session.load(Etudiant.class, code);
        session.delete(cl);
    
		session.getTransaction().commit();

	}

	public void updateEtudiant(Etudiant E) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		 
		session.beginTransaction();

		Etudiant cl = (Etudiant)session.load(Etudiant.class, E.getCode());
        cl.setNom(E.getNom());
        cl.setPrenom(E.getPrenom());
        cl.setVille(E.getVille());
        cl.setAge(E.getAge());

        session.save(cl);
    
		session.getTransaction().commit();
	}

	public Etudiant getEtudiantByCode(Long code) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		 
		Etudiant cl = (Etudiant)session.load(Etudiant.class, code);

		return cl;
	}

	public List<Etudiant> getAllEtudiants() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		 
		return session.createQuery("from Etudiant").list();
    }
	
	
	public void Initialiser() {
		System.out.println("Lancement d'application");
	}

}
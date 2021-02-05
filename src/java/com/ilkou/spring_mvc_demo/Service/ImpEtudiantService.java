package com.ilkou.spring_mvc_demo.Service;

import java.util.List;

import com.ilkou.spring_mvc_demo.DAO.Etudiant;
import com.ilkou.spring_mvc_demo.DAO.EtudiantDao;

public class ImpEtudiantService implements EtudiantService {                                                                               
	private EtudiantDao dao;
	public EtudiantDao getDao() {
		return dao;
	}
	public void setDao(EtudiantDao dao) {
		this.dao = dao;
	}
	public void addEtudiant(Etudiant E) {
		dao.addEtudiant(E);
	}
	public void deleteEtudiant(Long code) {
		dao.deleteEtudiant(code);
	}
	public void updateEtudiant(Etudiant E) {
		dao.updateEtudiant(E);
	}
	public Etudiant getEtudiantByCode(Long code) {
		return dao.getEtudiantByCode(code);
	}
	public List<Etudiant> getAllEtudiants() {
		return dao.getAllEtudiants();
	}
}

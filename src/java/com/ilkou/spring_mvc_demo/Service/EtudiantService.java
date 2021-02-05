package com.ilkou.spring_mvc_demo.Service;

import java.util.List;

import com.ilkou.spring_mvc_demo.DAO.Etudiant;

public interface EtudiantService {
	public void addEtudiant(Etudiant E);
	public void deleteEtudiant(Long code);
	public void updateEtudiant(Etudiant E);
	public Etudiant getEtudiantByCode(Long code);
	public List<Etudiant> getAllEtudiants();

}

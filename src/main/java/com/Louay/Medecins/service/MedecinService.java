package com.Louay.Medecins.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.Louay.Medecins.entities.Medecin;
import com.Louay.Medecins.entities.Specialite;

public interface MedecinService {
	Medecin saveMedecin(Medecin m);

	Medecin updateMedecin(Medecin m);

	void deleteMedecin(Medecin m);

	void deleteMedecinById(Long id);

	Medecin getMedecin(Long id);

	List<Medecin> getAllMedecins();

	Page<Medecin> getAllMedecinsParPage(int page, int size);

	List<Medecin> findByNomMedecin(String nom);

	List<Medecin> findByNomMedecinContains(String nom);

	List<Medecin> findByNomSalaire(String nom, Double salaire);

	List<Medecin> findBySpecialite(Specialite Specialite);

	List<Medecin> findBySpecialiteIdSpc(Long id);

	List<Medecin> findByOrderByNomMedecinAsc();

	List<Medecin> trierMedecinsNomsSalaire();
}
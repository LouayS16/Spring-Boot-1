package com.Louay.Medecins.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.Louay.Medecins.entities.Medecin;
import com.Louay.Medecins.entities.Specialite;
import com.Louay.Medecins.repos.MedecinRepository;

@Service
public class MedecinServiceImpl implements MedecinService {
	@Autowired
	MedecinRepository MedecinRepository;

	@Override
	public Medecin saveMedecin(Medecin m) {
		return MedecinRepository.save(m);
	}

	@Override
	public Medecin updateMedecin(Medecin m) {
		return MedecinRepository.save(m);
	}

	@Override
	public void deleteMedecin(Medecin m) {
		MedecinRepository.delete(m);
	}

	@Override
	public void deleteMedecinById(Long id) {
		MedecinRepository.deleteById(id);
	}

	@Override
	public Medecin getMedecin(Long id) {
		return MedecinRepository.findById(id).get();
	}

	@Override
	public List<Medecin> getAllMedecins() {
		return MedecinRepository.findAll();
	}

	@Override
	public Page<Medecin> getAllMedecinsParPage(int page, int size) {
		return MedecinRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Medecin> findByNomMedecin(String nom) {
		return MedecinRepository.findByNomMedecin(nom);
	}

	@Override
	public List<Medecin> findByNomMedecinContains(String nom) {
		return MedecinRepository.findByNomMedecinContains(nom);
	}

	@Override
	public List<Medecin> findByNomSalaire(String nom, Double salaire) {
		return MedecinRepository.findByNomSalaire(nom, salaire);
	}

	@Override
	public List<Medecin> findBySpecialite(Specialite Specialite) {
		return MedecinRepository.findBySpecialite(Specialite);
	}

	@Override
	public List<Medecin> findBySpecialiteIdSpc(Long id) {
		return MedecinRepository.findBySpecialiteIdSpc(id);
	}

	@Override
	public List<Medecin> findByOrderByNomMedecinAsc() {
		return MedecinRepository.findByOrderByNomMedecinAsc();
	}

	@Override
	public List<Medecin> trierMedecinsNomsSalaire() {
		return MedecinRepository.trierMedecinsNomsSalaire();
	}
}

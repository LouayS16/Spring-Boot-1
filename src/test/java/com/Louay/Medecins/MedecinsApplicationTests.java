package com.Louay.Medecins;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.Louay.Medecins.entities.Medecin;
import com.Louay.Medecins.entities.Specialite;
import com.Louay.Medecins.repos.MedecinRepository;
import com.Louay.Medecins.service.MedecinService;

@SpringBootTest
class MedecinsApplicationTests {
	@Autowired
	private MedecinRepository MedecinRepository;
	private MedecinService MedecinService;

	@Test
	public void testCreateMedecin() {
		Medecin med = new Medecin("Saad", "Wided", 30000.0, 98799212);
		MedecinRepository.save(med);
	}

	@Test
	public void testFindMedecin() {
		Medecin m = MedecinRepository.findById(2L).get();
		System.out.println(m);
	}

	@Test
	public void testUpdateMedecin() {
		Medecin m = MedecinRepository.findById(2L).get();
		m.setSalaire(45000.0);
		MedecinRepository.save(m);
	}

	@Test
	public void testDeleteMedecin() {
		MedecinRepository.deleteById(1L);
		;
	}

	@Test
	public void testListerTousMedecins() {
		List<Medecin> meds = MedecinRepository.findAll();
		for (Medecin m : meds) {
			System.out.println(m);
		}
	}

	@Test
	public void testFindByNomMedecin() {
		List<Medecin> meds = MedecinRepository.findByNomMedecin("Kilani");
		for (Medecin m : meds) {
			System.out.println(m);
		}
	}

	@Test
	public void testFindByNomMedecinContains() {
		List<Medecin> meds = MedecinRepository.findByNomMedecinContains("Ab");
		for (Medecin m : meds) {
			System.out.println(m);
		}
	}

	@Test
	public void testfindByNomSalaire() {
		List<Medecin> meds = MedecinRepository.findByNomSalaire("Kil", 1000.0);
		for (Medecin m : meds) {
			System.out.println(m);
		}
	}

	@Test
	public void testfindBySpecialite() {
		Specialite Spc = new Specialite();
		Spc.setIdSpc(1L);
		List<Medecin> meds = MedecinRepository.findBySpecialite(Spc);
		for (Medecin m : meds) {
			System.out.println(m);
		}
	}

	@Test
	public void findBySpecialiteIdSpc() {
		List<Medecin> meds = MedecinRepository.findBySpecialiteIdSpc(1L);
		for (Medecin m : meds) {
			System.out.println(m);
		}
	}

	@Test
	public void testfindByOrderByNomMedecinAsc() {
		List<Medecin> meds = MedecinRepository.findByOrderByNomMedecinAsc();
		for (Medecin m : meds) {
			System.out.println(m);
		}
	}

	@Test
	public void testTrierMedecinsNomsSalaire() {
		List<Medecin> meds = MedecinRepository.trierMedecinsNomsSalaire();
		for (Medecin m : meds) {
			System.out.println(m);
		}
	}
}

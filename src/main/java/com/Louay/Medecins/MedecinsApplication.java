package com.Louay.Medecins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.Louay.Medecins.entities.Medecin;
import com.Louay.Medecins.service.MedecinService;
@SpringBootApplication
public class MedecinsApplication implements CommandLineRunner {
@Autowired
private RepositoryRestConfiguration repositoryRestConfiguration;
MedecinService MedecinService;
public static void main(String[] args) {
SpringApplication.run(MedecinsApplication.class, args);
}
@Override
public void run(String... args) throws Exception {
repositoryRestConfiguration.exposeIdsFor(Medecin.class);
}
}
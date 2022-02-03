package com.modelsisreactfullstack.persistance.repository;

import com.modelsisreactfullstack.persistance.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {

    public Utilisateur findByEmail(String email);

}

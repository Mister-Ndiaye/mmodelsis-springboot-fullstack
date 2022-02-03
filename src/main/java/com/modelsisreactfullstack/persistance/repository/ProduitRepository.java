package com.modelsisreactfullstack.persistance.repository;

import com.modelsisreactfullstack.persistance.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit,Integer> {


}

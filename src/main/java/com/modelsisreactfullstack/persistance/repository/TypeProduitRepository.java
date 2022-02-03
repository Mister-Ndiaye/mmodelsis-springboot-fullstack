package com.modelsisreactfullstack.persistance.repository;

import com.modelsisreactfullstack.persistance.entity.TypeProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeProduitRepository extends JpaRepository<TypeProduit,Integer> {

}

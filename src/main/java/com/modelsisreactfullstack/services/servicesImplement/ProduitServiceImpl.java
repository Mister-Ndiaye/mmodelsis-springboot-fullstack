package com.modelsisreactfullstack.services.servicesImplement;


import com.modelsisreactfullstack.persistance.entity.Produit;
import com.modelsisreactfullstack.persistance.entity.ProduitAddDTO;
import com.modelsisreactfullstack.persistance.entity.TypeProduit;
import com.modelsisreactfullstack.persistance.repository.ProduitRepository;
import com.modelsisreactfullstack.persistance.repository.TypeProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ProduitServiceImpl {

    @Autowired
    private ProduitRepository produitRepository ;

    @Autowired
    private TypeProduitRepository typeProduitRepository;


    public List<Produit> getAll(){
      return  produitRepository.findAll();
    }

    public Produit addProduit(ProduitAddDTO produit) {
        Produit produit1 = new Produit();
        produit1.setNom(produit.getNom_produit());
        Produit produit2 = produitRepository.save(produit1);
        TypeProduit typeProduitb = typeProduitRepository.getById(produit.getId_type_produit());
        typeProduitb.getProduits().add(produit2);
        TypeProduit typeProduit = typeProduitRepository.save(typeProduitb);
          return produit2;
    }




    public Produit saveProduct(Produit produit){
        //TypeProduit tp = typeProduitRepository.getById(produit.getTypeProduit().getId());
        //produit.setTypeProduit(tp);
        return produitRepository.save(produit);
    }
    public Produit updateProduit(Produit produit){
        return  produitRepository.save(produit);
    }

    public String deleteProduit(int id){
        if(produitRepository.findById(id)!=null ){
            produitRepository.deleteById(id);
            return "produit supprimé avec succes" ;
        }
        return "erreur lors de la suppression";
    }



}

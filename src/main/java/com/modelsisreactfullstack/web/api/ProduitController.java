package com.modelsisreactfullstack.web.api;

import com.modelsisreactfullstack.persistance.entity.Produit;
import com.modelsisreactfullstack.persistance.entity.ProduitAddDTO;
import com.modelsisreactfullstack.persistance.entity.TypeProduit;
import com.modelsisreactfullstack.services.servicesImplement.ProduitServiceImpl;
import com.modelsisreactfullstack.services.servicesImplement.TypeProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "http://localhost:3000")

public class ProduitController {

   @Autowired
    private ProduitServiceImpl produitService ;

    @Autowired
    private TypeProduitService typeProduitService ;



    @PostMapping("/produits")
    public Produit addProduit(@RequestBody ProduitAddDTO produit){
        return produitService.addProduit(produit);


    }
    @GetMapping("/produits")
    public List<Produit> getAllProduits(){
        return produitService.getAll();
    }

    @PutMapping("/produit")
    public Produit updateProduit(@RequestBody Produit produit){
        return null ;

    }

}

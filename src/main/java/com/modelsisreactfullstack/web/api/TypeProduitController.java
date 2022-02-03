package com.modelsisreactfullstack.web.api;

import com.modelsisreactfullstack.persistance.entity.TypeProduit;
import com.modelsisreactfullstack.services.servicesImplement.TypeProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "http://localhost:3000")

public class TypeProduitController {

    @Autowired
    private TypeProduitService typeProduitService ;

    @GetMapping("/typeproduits")
    public List<TypeProduit> getAllProduct(){
        return typeProduitService.getAllTypeProduit();
    }

    @GetMapping("/get/{id}")
    public TypeProduit grtUId(@PathVariable("id") int id){
        return typeProduitService.getTypeProduct(id);
    }

    @PostMapping("/typeproduits")
    public TypeProduit addProduct(@RequestBody TypeProduit typeP){


        return typeProduitService.addTypeProduit(typeP);
    }

    @PostMapping("/typeproduit")
    public String delProduct(@RequestBody int id ){
        return typeProduitService.deleteTypeProduit(id);
    }


}

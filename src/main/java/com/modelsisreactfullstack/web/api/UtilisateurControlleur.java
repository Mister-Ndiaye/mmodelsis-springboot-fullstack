package com.modelsisreactfullstack.web.api;

import com.modelsisreactfullstack.persistance.entity.Utilisateur;
import com.modelsisreactfullstack.services.servicesImplement.UtilisateurServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "http://localhost:3000")
public class UtilisateurControlleur {

    @Autowired
    private UtilisateurServiceImp utilisateurServiceImp ;

    @PostMapping("/addUser")
    public Utilisateur addUser(@RequestBody Utilisateur utilisateur){
        return utilisateurServiceImp.addUtilisateur(utilisateur);
    }

    @GetMapping("/Users")
    public List<Utilisateur> getAllProduits(){
        return  utilisateurServiceImp.gettAll();
    }

}

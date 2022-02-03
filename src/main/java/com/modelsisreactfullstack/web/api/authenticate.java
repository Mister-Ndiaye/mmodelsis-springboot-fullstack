package com.modelsisreactfullstack.web.api;

import com.modelsisreactfullstack.persistance.entity.Utilisateur;
import com.modelsisreactfullstack.services.servicesImplement.UtilisateurServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class authenticate {

    @Autowired
    private  UtilisateurServiceImp utilisateurServiceImp ;
    @PostMapping("authenticate")
    public Utilisateur authenticate(@RequestBody Utilisateur utilisateur){

        return  utilisateurServiceImp.authenticate(utilisateur) ;
    }
}

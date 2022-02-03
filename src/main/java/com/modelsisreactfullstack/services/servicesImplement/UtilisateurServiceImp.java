package com.modelsisreactfullstack.services.servicesImplement;

import com.modelsisreactfullstack.persistance.entity.Utilisateur;
import com.modelsisreactfullstack.persistance.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurServiceImp {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

public Utilisateur addUtilisateur(Utilisateur utilisateur){
    return utilisateurRepository.save(utilisateur);
}

public List<Utilisateur> gettAll(){
    return utilisateurRepository.findAll();
}

public  Utilisateur authenticate (Utilisateur utilisateur){
     Utilisateur user =       utilisateurRepository.findByEmail(utilisateur.getEmail());
           if(user!=null && user.getPassword()==utilisateur.getPassword()){
               return user ;
           }
           return null;
}

}

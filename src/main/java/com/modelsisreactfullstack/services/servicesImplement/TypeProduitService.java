package com.modelsisreactfullstack.services.servicesImplement;

import com.modelsisreactfullstack.persistance.entity.TypeProduit;
import com.modelsisreactfullstack.persistance.repository.TypeProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeProduitService {

    @Autowired
    private TypeProduitRepository typeProduitRepository ;


    public List<TypeProduit> getAllTypeProduit(){
        return typeProduitRepository.findAll();
    }

    public TypeProduit addTypeProduit(TypeProduit typeProduit){


        if(typeProduit.getNomType()!=null){

            return typeProduitRepository.save(typeProduit);
        }

        return null ;
    }

    public  String deleteTypeProduit(int id){

        try {
            typeProduitRepository.deleteById(id);
            return "Type produit supprimé avec succes";
        }catch (Exception e){

            return "erreur lors de la suppression " ;
        }
    }

    public TypeProduit  updateTypeProduit(TypeProduit typeProduit){

        Optional<TypeProduit> updateProduit =  typeProduitRepository.findById(typeProduit.getId());

        if(updateProduit!=null){

            return  typeProduitRepository.save(typeProduit);
        }

        return null;
    }

public TypeProduit getTypeProduct(int id){
        return typeProduitRepository.getById(id);
}

}


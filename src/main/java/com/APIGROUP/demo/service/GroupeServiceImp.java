package com.APIGROUP.demo.service;

import com.APIGROUP.demo.model.Groupe;
import com.APIGROUP.demo.repositories.GroupeRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupeServiceImp implements GroupeService{

    @Autowired
    GroupeRepositories groupeRepositories;
    @Override
    public String ajout_groupe(Groupe groupe) {
        Optional<Groupe> groupNom = groupeRepositories.findByNom(groupe.getName());
        if (groupNom.isPresent()){
            return "nom";
        }
        this.groupeRepositories.save(groupe);
        return "Ajout effectué avec succes";
    }

    @Override
    public List<Groupe> listGroup() {
     return    this.groupeRepositories.findAll();
    }

    @Override
    public String supprimer_groupe(Long id) {
        this.groupeRepositories.deleteById(id);
        return "Groupe supprimer avec succes";
    }

    @Override
    public Groupe getByIdGroupe(Long id) {
        return this.groupeRepositories.findById(id).get();
    }

    @Override
    public String modifier_groupe(Groupe groupe, Long id) {
       Groupe groupeExist = groupeRepositories.findById(id).get();

       groupeExist.setName(groupe.getName());
       groupeExist.setDate_creation(groupe.getDate_creation());
       groupeRepositories.save(groupeExist);
       return "Modification effectuer avec succes";
    }


}

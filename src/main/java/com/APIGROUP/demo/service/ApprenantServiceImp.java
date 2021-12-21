/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.APIGROUP.demo.service;

import com.APIGROUP.demo.Etat;
import com.APIGROUP.demo.model.Apprenant;
import com.APIGROUP.demo.model.Groupe;
import com.APIGROUP.demo.repositories.ApprenantRepositories;
import java.util.List;
import java.util.Optional;

import com.APIGROUP.demo.repositories.GroupeRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 *
 * @author fadiala.sidibe
 */
@Service
@Transactional
public class ApprenantServiceImp implements ApprenantService {
    @Autowired
    ApprenantRepositories apprenantRepositories;

    @Autowired
    GroupeRepositories groupeRepositories;

    @Override
    public String ajout_apprenant(Apprenant apprenant) {
       Optional<Apprenant> appemail = apprenantRepositories.findByEmail(apprenant.getEmail());
       Optional<Apprenant> apptelephone = apprenantRepositories.findByTelephone(apprenant.getTelephone());
       
       if(appemail.isPresent()){
           return "email";
       } 
       if(apptelephone.isPresent()){
           return "telephone";
       }
       apprenantRepositories.save(apprenant);
       return "Ajout effectué avec succes !!!";
    }

    @Override
    public List<Apprenant> listApprenant() {
    return apprenantRepositories.findAll();
    }

    @Override
    public String supprimer_apprenant( Long id) {
 //To change body of generated methods, choose Tools | Templates.
    // this.apprenantRepositories.deleteById(id);
        Apprenant apprenant = apprenantRepositories.findById(id).get();

   apprenant.setSupprimer(true);
   apprenant.setEtat(Etat.DESACTIVER);
    return "Vous avez supprimez un apprenant "+apprenant.getPrenom()+" "+apprenant.getNom();
    }

    @Override
    public Apprenant getApprenantsById(Long id) {
        return apprenantRepositories.findById(id).get();
    }

    @Override
    public String modifier_apprenant(Apprenant apprenant, Long id) {
         Apprenant apprenantExistant = this.apprenantRepositories.findById(id).get();
         
         apprenantExistant.setNom(apprenant.getNom());
         apprenantExistant.setPrenom(apprenant.getPrenom());
         apprenantExistant.setEmail(apprenant.getEmail());
         apprenantExistant.setTelephone(apprenantExistant.getTelephone());
         apprenantRepositories.save(apprenantExistant);
         return "Apprenant modifié avec succes";
    }


}

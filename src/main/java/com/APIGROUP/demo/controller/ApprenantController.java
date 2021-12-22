/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.APIGROUP.demo.controller;

import com.APIGROUP.demo.model.Apprenant;
import com.APIGROUP.demo.service.ApprenantService;
import com.APIGROUP.demo.service.ApprenantServiceImp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author fadiala.sidibe
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/api/APPGROUP")
public class ApprenantController {
    @Autowired
    ApprenantServiceImp apprenantServiceImp;

    @Autowired
    ApprenantService apprenantService;
    
    //********************************************* Ajout d'un apprenant *****************************
    
    @PostMapping("/addApp")
    public String saveApp(@RequestBody Apprenant apprenant){
    return this.apprenantServiceImp.ajout_apprenant(apprenant);
    }
    
    // ******************************************** Liste des apprenants ******************************
    
    @GetMapping("/listApp")
    List<Apprenant> listApp(){
        return this.apprenantService.listApprenant();
    }
    
    // ******************************************* Suppression de l'apprenant ***************************
    @DeleteMapping("/deleteApp/{id}")
    public String delete(@PathVariable Long id){
    return this.apprenantServiceImp.supprimer_apprenant(id);
    }
    
    // *************************************** Liste par id apprenant **************************************
    @GetMapping("/InfoApp/{id}")
    public Apprenant getApprenantById(@PathVariable Long id){
    return this.apprenantServiceImp.getApprenantsById(id);
    }
    
    // ************************************** Modification de l'apprenant ******************************
    @PutMapping("/updateApp/{id}")
    public String updateApprenant(@PathVariable Long id, @RequestBody Apprenant apprenant){
   return this.apprenantServiceImp.modifier_apprenant(apprenant, id);
    
    }
    
    
}

package com.APIGROUP.demo.controller;

import com.APIGROUP.demo.model.Groupe;
import com.APIGROUP.demo.service.GroupeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/groupe")
public class GroupeController {

     @Autowired
    GroupeServiceImp groupeServiceImp;

     //****************************************** Ajout de Groupe *************************
     @PostMapping("/addGroup")
    public String save(@RequestBody Groupe groupe){
     return this.groupeServiceImp.ajout_groupe(groupe);
     }

     // ***************************************** Liste de Groupe *************************
    @GetMapping("/listGroup")
    public List<Groupe> groupeList(){
         return this.groupeServiceImp.listGroup();
    }
    // ************************************ Suppression de Groupe *******************************
    @DeleteMapping("/delGroup/{id}")
    public String deleteGroup(@PathVariable Long id, @RequestBody Groupe groupe){
         return this.groupeServiceImp.supprimer_groupe(id);
    }

    // ************************************* Affichage du Groupe par id **************************************
    @GetMapping("/infoGroupById/{id}")
    public Groupe getGroupById(@PathVariable Long id){
         return this.groupeServiceImp.getByIdGroupe(id);
    }

    // ************************************* Modification du Groupe **************************************
    @PutMapping("/updateGroupe/{id}")
    public String update(@PathVariable Long id, @RequestBody Groupe groupe){
         return this.groupeServiceImp.modifier_groupe(groupe, id);
    }

    // ************************************** Generer les groupes automatiques ******************************

    @GetMapping("/genGroupe/{nbreGroupe}")
    public List<Groupe> genereGroupe(@PathVariable("nbreGroupe") Integer nombreGroupe) {
        return groupeServiceImp.generateByNbreGroupe(nombreGroupe);
    }
}

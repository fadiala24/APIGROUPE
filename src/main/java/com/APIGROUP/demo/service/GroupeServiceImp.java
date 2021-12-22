package com.APIGROUP.demo.service;

import com.APIGROUP.demo.model.Apprenant;
import com.APIGROUP.demo.model.Groupe;
import com.APIGROUP.demo.repositories.ApprenantRepositories;
import com.APIGROUP.demo.repositories.GroupeRepositories;
import com.APIGROUP.demo.repositories.PromotionRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class GroupeServiceImp implements GroupeService{

    @Autowired
    ApprenantRepositories apprenantRepositories;

    @Autowired
    PromotionRepositorie promotionRepositorie;

    @Autowired
    GroupeRepositories groupeRepositories;
    @Override
    public String ajout_groupe(Groupe groupe) {

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
       groupeRepositories.save(groupeExist);
       return "Modification effectuer avec succes";
    }

    @Override
    public List<Groupe> generateByNbreGroupe(Integer nombreGroupe) {

        // ************************************* Classe Random = Ordre Aléatoire *****************************
        Random random = new Random();

        // *************************************  Liste des apprenants recuperer ****************************
        List<Apprenant> allApprenantList = apprenantRepositories.findAll();

        // **************************************** Je recupère le nombre d'apprenants à travers la taille **************************
        Integer nombreApprenant = apprenantRepositories.findAll().size();

        // *************************************** Liste des groupes et les membres(Apprenant) qu'ils contiennent ***************
        List<Groupe> groupeListGenerate = new ArrayList<Groupe>();
        List<Apprenant> apprenantList = new ArrayList<>();
        // ****************************************************Création de deux variables ********************
        Integer nbreMembreParGroup = 0;
        Integer membreNonRepartie ;

        if (nombreApprenant % nombreGroupe !=0 ){

            membreNonRepartie = (nombreApprenant % nombreGroupe);
            nbreMembreParGroup = (nombreApprenant - membreNonRepartie) / nombreGroupe;
            for (int i = 0; i <= nombreGroupe; i++ ){

                for (int j = 0; j< nbreMembreParGroup; j++){
                    int randomIdex = random.nextInt(allApprenantList.size());
                    Apprenant randomApprenant = allApprenantList.get(randomIdex);
                    apprenantList.add(randomApprenant);
                    allApprenantList.remove(randomIdex);
                }
                Groupe groupe = new Groupe();
                groupe.setName("Groupe"+i);
                groupe.setApprenants(apprenantList);
                groupeRepositories.save(groupe);
                groupeListGenerate.add(groupe);
                apprenantList.clear();
            }
        }
            else {

            nbreMembreParGroup = nombreApprenant / nombreGroupe;
            for(int i = 1; i <= nombreGroupe; i++)
            {
                for(int j = 0; j < nbreMembreParGroup; j++)
                {
                    int randomIdex = random.nextInt(allApprenantList.size());
                    Apprenant randomApprenant = allApprenantList.get(randomIdex);
                    apprenantList.add(randomApprenant);
                    allApprenantList.remove(randomIdex);
                }
                Groupe groupe = new Groupe();
                groupe.setName("Groupe"+i);
                groupe.setApprenants(apprenantList);
                groupeRepositories.save(groupe);
                groupeListGenerate.add(groupe);
                apprenantList.clear();
            }
        }
        return groupeListGenerate;
    }


}

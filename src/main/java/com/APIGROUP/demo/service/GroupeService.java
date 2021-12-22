package com.APIGROUP.demo.service;


import com.APIGROUP.demo.model.Groupe;

import java.util.List;

public interface GroupeService {
    public String ajout_groupe(Groupe groupe);
    public List<Groupe> listGroup();
    public String supprimer_groupe( Long id);
    public Groupe getByIdGroupe(Long id);
    public String modifier_groupe(Groupe groupe, Long id);
    public List<Groupe> generateByNbreGroupe(Integer nombreGroupe);
}

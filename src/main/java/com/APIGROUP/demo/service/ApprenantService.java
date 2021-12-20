/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.APIGROUP.demo.service;

import com.APIGROUP.demo.model.Apprenant;
import java.util.List;

/**
 *
 * @author fadiala.sidibe
 */
public interface ApprenantService {
    public String ajout_apprenant(Apprenant apprenant);
    public List<Apprenant> listApprenant();
    public String supprimer_apprenant( Long id);
    public Apprenant getApprenantsById(Long id);
    public String modifier_apprenant(Apprenant apprenant, Long id);
}

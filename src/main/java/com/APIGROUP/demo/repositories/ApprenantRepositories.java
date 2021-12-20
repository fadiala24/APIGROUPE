/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.APIGROUP.demo.repositories;

import com.APIGROUP.demo.model.Apprenant;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fadiala.sidibe
 */
//@RepositoryRestController
public interface ApprenantRepositories extends JpaRepository<Apprenant, Long> {
    
    Optional<Apprenant> findByEmail(String email);
    Optional<Apprenant> findByTelephone(int telephone);
    
    
}

package com.APIGROUP.demo.repositories;

import com.APIGROUP.demo.model.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.*;
import java.util.Optional;

public interface GroupeRepositories extends JpaRepository <Groupe, Long> {

}

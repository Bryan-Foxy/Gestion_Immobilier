package com.example.micro.Repository;

import com.example.micro.classes.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratRepository extends JpaRepository <Contrat,Integer> {

}

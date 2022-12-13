package com.example.micro.Repository;

import com.example.micro.classes.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitRepository extends JpaRepository <Produit,Integer> {

}

package com.example.micro.Repository;

import com.example.micro.classes.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository <Categorie , Integer> {
}

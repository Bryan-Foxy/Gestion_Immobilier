package com.example.micro.Service;

import com.example.micro.classes.Categorie;
import com.example.micro.classes.Produit ;
import java.util.List;

public interface IcategorieService {

    List<Categorie> retrieveAllCategorie();


    Categorie updateCategorie (Categorie c);

    Categorie addCategorie (Categorie c);

    Categorie retrieveCategorie (Integer idCategorie);


    void removeCategorie(Integer Idcategorie);
}

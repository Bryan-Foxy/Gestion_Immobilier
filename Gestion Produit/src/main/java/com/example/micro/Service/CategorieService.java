package com.example.micro.Service;

import com.example.micro.Repository.CategorieRepository;
import com.example.micro.classes.Categorie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CategorieService implements IcategorieService {

    @Autowired
    CategorieRepository categorieRepository ;


@Override
    public List<Categorie> retrieveAllCategorie() {
        List<Categorie> Categorie=categorieRepository.findAll();
        return Categorie;
    }


@Override
    public Categorie updateCategorie(Categorie c) {
        return categorieRepository.save(c);
    }
@Override
    public Categorie addCategorie(Categorie c) {
        return categorieRepository.save(c);
    }
@Override
    public Categorie retrieveCategorie(Integer Idcategorie) {
        return categorieRepository.findById(Idcategorie).orElse(null);
    }





@Override
    public void removeCategorie(Integer Idcategorie) {
        categorieRepository.deleteById(Idcategorie);

    }
}

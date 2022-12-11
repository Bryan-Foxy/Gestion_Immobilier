package com.example.micro.Service;

import com.example.micro.Repository.ProduitRepository;
import com.example.micro.classes.Produit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProduitService implements IproduitService {
    @Autowired
    ProduitRepository produitRepository ;
@Override
    public List<Produit> retrieveAllProduit() {
        //List<Produit> Produit=ProduitRepository.findALL();
    List<Produit> produits=produitRepository.findAll();
        return produits;
    }


@Override
    public Produit updateProduit(Produit p) {
        return produitRepository.save(p);
    }
@Override
    public Produit addProduit(Produit p) {
        return produitRepository .save(p);
    }
@Override
    public Produit retrieveProduit(Integer idProduit) {
        return produitRepository.findById(idProduit).orElse(null) ;
    }
@Override
    public void removeProduit(Integer idProduit) {
        produitRepository.deleteById(idProduit);

    }
}
//return produitRepository.findById().orElse(null);
package com.example.micro.Service;

import com.example.micro.classes.Produit;

import java.util.List;

public interface IproduitService {

    List<Produit> retrieveAllProduit();


    Produit updateProduit(Produit p);

    Produit addProduit (Produit p);

    Produit retrieveProduit (Integer idProduit);

    void removeProduit(Integer idProduit);
}

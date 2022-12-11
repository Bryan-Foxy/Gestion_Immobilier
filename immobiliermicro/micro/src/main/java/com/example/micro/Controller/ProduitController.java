package com.example.micro.Controller;

import com.example.micro.Service.ProduitService;
import com.example.micro.classes.Produit;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Produit")
public class ProduitController {
    ProduitService produitService;

    @GetMapping("/retrieve-all-Produit")
    public List<Produit> getallProduit()
    {
        List<Produit> listProduit = produitService.retrieveAllProduit();
        return listProduit ;
    }
    @PostMapping("/add-Produit")
    public Produit addProduit(@RequestBody Produit p)
    {
        return produitService.addProduit(p);
    }
    @GetMapping("/retrieve-Produit/{id-Produit}")
    public Produit getProduit(@PathVariable("id-Produit") Integer idProduit)
    {
        return produitService.retrieveProduit(idProduit);
    }
    @PutMapping("/update-Produit")
    public Produit updateForum(@RequestBody Produit p)
    {
        return produitService.updateProduit(p);
    }

    @DeleteMapping("/remove-Produit/{id-Produit}")
    public void removeProduit(@PathVariable("id-Produit") Integer idProduit)
    {
        produitService.removeProduit(idProduit);
    }

}

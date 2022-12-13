package com.example.micro.Controller;

import com.example.micro.Service.CategorieService;
import com.example.micro.Service.IcategorieService;
import com.example.micro.classes.Categorie;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
        @AllArgsConstructor
        @RequestMapping("/Categorie")
public class CategorieController {
@Autowired
        CategorieService categorieService ;

        @GetMapping("/retrieve-all-Categories")
        public List<Categorie> getallCategorie()
        {
            List<Categorie> listCategorie = categorieService.retrieveAllCategorie();
            return listCategorie ;
        }

    @PostMapping("/add-Categorie")

    public Categorie addCategorie(@RequestBody Categorie c)
    {
        return categorieService.addCategorie(c);
    }

    @GetMapping("/retrieve-Categorie/{id-Categorie}")

    public Categorie getCategorie(@PathVariable("id-Categorie") Integer idCategorie)
    {
        return categorieService.retrieveCategorie(idCategorie);
    }

    @PutMapping("/update-Categorie")
    public Categorie updateCategorie(@RequestBody Categorie c)
    {
        return categorieService.updateCategorie(c);
    }

    @DeleteMapping("/remove-Categorie/{id-Categorie}")
    public void removeCommentaire(@PathVariable("id-Categorie") Integer idCategorie)
    {
        categorieService.removeCategorie(idCategorie);
    }
}

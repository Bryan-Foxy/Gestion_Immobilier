package com.example.micro.Controller;

import com.example.micro.Service.ForumService;
import com.example.micro.Service.ICommentaireService;
import com.example.micro.classes.Commentaire;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Commentaire")
public class CommentaireController {
    ICommentaireService iServiceCommentaire;
    // http://localhost:8099/Micro/Commentaire/retrieve-all-Commentaire
    @GetMapping("/retrieve-all-Commentaire")
    public List<Commentaire> getallCommentaire()
    {
        List<Commentaire> listCommentaires = iServiceCommentaire.retrieveAllCommentaires();
        return listCommentaires ;
    }
    // http://localhost:8099/Micro/Commentaire/add-Commentaire
    @PostMapping("/add-Commentaire")
    public Commentaire addCommentaire(@RequestBody Commentaire c)
    {
        return iServiceCommentaire.addCommentaire(c);
    }
    // http://localhost:8099/Micro/Commentaire/retrieve-Commentaire
    @GetMapping("/retrieve-Commentaire/{id-Com}")
    public Commentaire getCommentaire(@PathVariable("id-Com") Integer idCom)
    {
        return iServiceCommentaire.retrieveCommentaire(idCom);
    }
    // http://localhost:8099/Micro/Commentaire/update-Commentaire
    @PutMapping("/update-Commentaire")
    public Commentaire updateCommentaire(@RequestBody Commentaire c)
    {
        return iServiceCommentaire.updateCommentaire(c);
    }

    // http://localhost:8099/Micro/Commentaire/remove-Commentaire
    @DeleteMapping("/remove-Commentaire/{id-Com}")
    public void removeCommentaire(@PathVariable("id-Com") Integer idCom)
    {
        iServiceCommentaire.removeCommentaire(idCom);
    }

}

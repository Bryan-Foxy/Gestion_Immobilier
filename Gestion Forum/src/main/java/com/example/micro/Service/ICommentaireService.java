package com.example.micro.Service;

import com.example.micro.classes.Commentaire;
import com.example.micro.classes.Forum;

import java.util.List;

public interface ICommentaireService {

    List<Commentaire> retrieveAllCommentaires();

    Commentaire updateCommentaire (Commentaire f);

    Commentaire addCommentaire (Commentaire f);

    Commentaire retrieveCommentaire (Integer idCommentaire);

    void removeCommentaire(Integer idCommentaire);
}

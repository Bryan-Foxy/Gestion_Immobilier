package com.example.micro.Service;

import com.example.micro.Repository.CommentaireRepository;
import com.example.micro.Repository.ForumRepository;
import com.example.micro.classes.Commentaire;
import com.example.micro.classes.Forum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CommentaireService implements ICommentaireService {

    @Autowired
    CommentaireRepository commentaireRepository;
    @Override
    public List<Commentaire> retrieveAllCommentaires() {
        List<Commentaire> commentaires=commentaireRepository.findAll();
        return commentaires;
    }

    @Override
    public Commentaire updateCommentaire(Commentaire f) {
        return commentaireRepository.save(f);
    }

    @Override
    public Commentaire addCommentaire(Commentaire f) {
        return commentaireRepository.save(f);
    }

    @Override
    public Commentaire retrieveCommentaire(Integer idCommentaire) {
        return commentaireRepository.findById(idCommentaire).orElse(null);
    }

    @Override
    public void removeCommentaire(Integer idCommentaire) {
        commentaireRepository.deleteById(idCommentaire);

    }
}

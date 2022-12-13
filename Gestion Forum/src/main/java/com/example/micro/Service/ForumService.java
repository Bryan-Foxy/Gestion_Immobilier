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
public class ForumService implements IForumService {
    @Autowired
    ForumRepository forumRepository;
    @Override
    public List<Forum> retrieveAllForums() {
        List<Forum> forums=forumRepository.findAll();
        return forums;
    }

    @Override
    public Forum updateForum(Forum f) {
        return forumRepository.save(f);
    }

    @Override
    public Forum addForum(Forum f) {
        return forumRepository.save(f);
    }

    @Override
    public Forum retrieveForum(Integer idForum) {
        return forumRepository.findById(idForum).orElse(null);
    }

    @Override
    public void removeForum(Integer idForum) {
        forumRepository.deleteById(idForum);

    }
}
//return produitRepository.findById().orElse(null);
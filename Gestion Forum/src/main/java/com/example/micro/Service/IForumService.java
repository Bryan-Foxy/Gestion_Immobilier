package com.example.micro.Service;

import com.example.micro.classes.Commentaire;
import com.example.micro.classes.Forum;

import java.util.List;

public interface IForumService {

    List<Forum> retrieveAllForums();

    Forum updateForum (Forum f);

    Forum addForum (Forum f);

    Forum retrieveForum (Integer idForum);

    void removeForum(Integer idForum);
}

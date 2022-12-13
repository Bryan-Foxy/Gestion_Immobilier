package com.example.micro.Repository;

import com.example.micro.classes.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaireRepository extends JpaRepository <Commentaire,Integer> {

}

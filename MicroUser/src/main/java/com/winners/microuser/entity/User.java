package com.winners.microuser.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id_client;
    @Temporal(TemporalType.DATE)
    Date date_naissance;
    String mail;
    String nom;
    String password;
    String prenom;
    String sexe;

    public User(String nom) {
        super();
        this.nom = nom;
    }
}

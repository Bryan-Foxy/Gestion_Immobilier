package com.example.micro.classes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.security.PrivateKey;
import java.util.List;

@Entity
@ToString
@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produit  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Reference",nullable = false )
    private Integer Reference ;
    private String Nompropitaire ;
    private String Prenomprop ;
    private Integer Numprop ;
    private String Description ;
    private String Addresse ;
    private Integer Superficie ;
    private Integer Nbrpiece ;
    private Integer Salon ;
    @JsonIgnore
    @ManyToOne
    private Categorie categorie;
}

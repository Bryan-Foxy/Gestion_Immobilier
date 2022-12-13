package com.example.micro.classes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@ToString
@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Categorie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Idcategorie",nullable = false)
private Integer Idcategorie ;
private Integer Idappartment ;
private Integer Idville ;
private Integer Idterrain ;
private Integer Idbureau ;
@JsonIgnore
    @OneToMany (mappedBy = "categorie")
    private List<Produit> produits ;
}

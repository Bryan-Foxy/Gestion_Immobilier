package com.example.micro.classes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

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
public class Forum implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idForum",nullable = false)
    private Integer idForum;
    private String titre;
    private String description;

    @ToString.Exclude
    @JsonIgnore
    @OneToMany(mappedBy = "forum")
    private List<Commentaire> Commentaires;
}

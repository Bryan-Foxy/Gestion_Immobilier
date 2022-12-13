package com.example.micro.classes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@ToString
@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCommentaire",nullable = false)
    private Integer idCommentaire;
    private String description;

    @ToString.Exclude
    @JsonIgnore
    @ManyToOne
    private Forum forum;
}

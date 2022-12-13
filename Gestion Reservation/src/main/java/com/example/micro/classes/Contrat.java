package com.example.micro.classes;

import lombok.*;

import javax.persistence.*;

@Entity
@ToString
@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {
    @Id
    @GeneratedValue
    private Integer IdContrat;

    private String Duree;

    private String Description;

    @OneToOne
    private Reservation reservation;
}

package com.example.micro.classes;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@ToString
@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation implements Serializable {
    @Id
    @GeneratedValue
    private Integer IdRes;
    @Temporal(TemporalType.DATE)
    private Date DateRes;
    private Boolean Etat;
    @OneToOne(mappedBy = "reservation")
    private Contrat Contrat;
}

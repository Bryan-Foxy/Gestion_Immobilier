package com.example.micro.Service;

import com.example.micro.classes.Contrat;

import java.util.List;

public interface IContratService {

    List<Contrat> retrieveAllContrats();
    Contrat updateContrat (Contrat contrat);
    Contrat addContrat (Contrat contrat);
    Contrat retrieveContrat (Integer IdContrat);
    void removeContrat(Integer IdContrat);
}

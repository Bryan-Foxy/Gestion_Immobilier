package com.example.micro.Service;

import com.example.micro.Repository.ContratRepository;
import com.example.micro.classes.Contrat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ContratService implements IContratService {
    @Autowired
    ContratRepository CR;

    @Override
    public List<Contrat> retrieveAllContrats() {
        return CR.findAll();
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return CR.save(contrat);
    }

    @Override
    public Contrat addContrat(Contrat contrat) {
        return CR.save(contrat);
    }

    @Override
    public Contrat retrieveContrat(Integer IdContrat) {
        return CR.findById(IdContrat).orElse(null);
    }

    @Override
    public void removeContrat(Integer IdContrat) {
        CR.deleteById(IdContrat);
    }
}
//return produitRepository.findById().orElse(null);
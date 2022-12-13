package com.example.micro.Controller;

import com.example.micro.Service.ContratService;
import com.example.micro.classes.Contrat;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Contrat")
public class ContratController {
    ContratService gg;
    @GetMapping("/retrieveAllContarts")
    public List<Contrat> retrieveAllContarts() {
        return gg.retrieveAllContrats();
    }
    @PutMapping("/updateContrat")
    public Contrat updateEquipe(@RequestBody Contrat contrat) {
        return gg.updateContrat(contrat);
    }
    @PostMapping("/addContrat")
    public Contrat addEquipe(@RequestBody Contrat contrat) {
        return gg.addContrat(contrat);
    }

    @GetMapping("/retrieveContrat/{IdContrat}")
    public Contrat retrieveContrat(@PathVariable(value = "idContrat") Integer IdContrat) {
        return gg.retrieveContrat(IdContrat);
    }

    @DeleteMapping("/removeContrat/{IdContrat}")
    public  List<Contrat> removeEquipe(@PathVariable(value = "IdContrat") Integer IdContrat) {
        gg.removeContrat(IdContrat);
        return gg.retrieveAllContrats();
    }


}

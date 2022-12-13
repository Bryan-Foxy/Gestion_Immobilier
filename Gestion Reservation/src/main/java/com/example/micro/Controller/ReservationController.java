package com.example.micro.Controller;

import com.example.micro.Service.ReservationService;
import com.example.micro.classes.Reservation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
        @AllArgsConstructor
        @RequestMapping("/Reservation")
public class ReservationController {
    ReservationService RS;
    @GetMapping("/retrieveAllReservations")
    public List<Reservation> retrieveAllReservations() {
        return RS.retrieveAllReservations();
    }
    @PutMapping("/updateReservation")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return RS.updateReservation(reservation);
    }
    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return RS.addReservation(reservation);
    }

    @GetMapping("/retrieveReservation/{IdRes}")
    public Reservation retrieveReservation(@PathVariable(value = "idRes") Integer IdRes) {
        return RS.retrieveReservation(IdRes);
    }

    @DeleteMapping("/removeReservation/{IdRes}")
    public  List<Reservation> removeEquipe(@PathVariable(value = "IdRes") Integer IdRes) {
        RS.removeReservation(IdRes);
        return RS.retrieveAllReservations();
    }
}

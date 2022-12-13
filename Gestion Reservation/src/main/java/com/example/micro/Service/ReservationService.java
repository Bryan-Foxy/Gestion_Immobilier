package com.example.micro.Service;

import com.example.micro.Repository.ReservationRepository;
import com.example.micro.classes.Reservation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ReservationService implements IReservationService {

    @Autowired
    ReservationRepository RR;
    @Override
    public List<Reservation> retrieveAllReservations() {
        return RR.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return RR.save(reservation);
    }

    @Override
    public Reservation addReservation(Reservation reservation) {
        return RR.save(reservation);
    }

    @Override
    public Reservation retrieveReservation(Integer IdRes) {
        return RR.findById(IdRes).orElse(null);
    }

    @Override
    public void removeReservation(Integer IdRes) {
        RR.deleteById(IdRes);
    }
}

package com.example.micro.Service;

import com.example.micro.classes.Reservation;

import java.util.List;

public interface IReservationService {

    List<Reservation> retrieveAllReservations();
    Reservation updateReservation (Reservation reservation);
    Reservation addReservation (Reservation reservation);
    Reservation retrieveReservation (Integer IdRes);
    void removeReservation(Integer IdRes);
}

package com.example.micro.Repository;

import com.example.micro.classes.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository <Reservation, Integer> {
}

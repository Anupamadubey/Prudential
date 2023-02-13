package com.prudential.assignment.CarRental.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prudential.assignment.CarRental.Entity.Reservation;

@Repository
public interface ReservationRepository  extends JpaRepository<Reservation, Integer>{

}

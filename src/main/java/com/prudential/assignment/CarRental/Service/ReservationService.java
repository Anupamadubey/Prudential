package com.prudential.assignment.CarRental.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prudential.assignment.CarRental.DAO.CarRepository;
import com.prudential.assignment.CarRental.DAO.ReservationRepository;
import com.prudential.assignment.CarRental.Entity.Reservation;


@Service
public class ReservationService {
	
	@Autowired
	private ReservationRepository reservationRepository;
	@Autowired
	private CarRepository carRepository;
	
	public Optional<Reservation> getReservationById(int id) {
		return reservationRepository.findById(id);
	}
	
	public void updateReservation(Reservation Reservation,int id) {
		Optional<Reservation> current = reservationRepository.findById(id);
		if(current!=null) {
			reservationRepository.save(Reservation);
		}
		
	}
	
	public void createReservation(Reservation Reservation) {		
		reservationRepository.save(Reservation);
	}
	
	public void deleteReservation(int id) {
		reservationRepository.deleteById(id);
	}


}

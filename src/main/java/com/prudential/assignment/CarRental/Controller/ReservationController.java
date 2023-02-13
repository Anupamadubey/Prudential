package com.prudential.assignment.CarRental.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prudential.assignment.CarRental.Entity.Reservation;
import com.prudential.assignment.CarRental.Service.ReservationService;

@RestController
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("/get/reservation/{id}")
	public Optional<Reservation> getReservationById(@PathVariable  int id) {
		return reservationService.getReservationById(id);
	}
	
	@PostMapping("/create/reservation")
	public void createReservation(@RequestBody Reservation Reservation) {
		reservationService.createReservation(Reservation);
	}
	
	@PostMapping("/return/{id}")
	public void retunReservedCar(@PathVariable int id) {
		reservationService.returnCar(id);
	}
	
	@DeleteMapping("/delete/reservation/{id}")
	public void deleteReservation( @PathVariable int id) {
		reservationService.cancelReservation(id);
	}
	


}

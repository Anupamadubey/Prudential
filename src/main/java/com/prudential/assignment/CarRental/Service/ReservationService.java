package com.prudential.assignment.CarRental.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prudential.assignment.CarRental.DAO.CarRepository;
import com.prudential.assignment.CarRental.DAO.ReservationRepository;
import com.prudential.assignment.CarRental.Entity.Car;
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
	
	
	public void createReservation(Reservation reservation) {	
		Integer carId = reservation.getCarId();
		Integer accountId = reservation.getAccountId();
		if(accountId!=null && carId!=null) {
			Optional<Car> car = carRepository.findById(carId);
			int count = car.get().getCount();
			if(count!=0) {
				car.get().setCount(count-1);
				carRepository.save(car.get());
				reservation.setStatus("Booked");
				reservationRepository.save(reservation);
			}
		}
		
	}
	public void returnCar(int id) {
		Optional<Reservation> reservation = reservationRepository.findById(id);
		int carId = reservation.get().getCarId();
		Optional<Car> car= carRepository.findById(carId);
		int count = car.get().getCount();
		car.get().setCount(count+1);
		reservation.get().setStatus("Completed");
		reservationRepository.save(reservation.get());
	}
	
	public void cancelReservation(int id) {
		Optional<Reservation> reservation = reservationRepository.findById(id);
		reservation.get().setStatus("Cancelled");
		reservationRepository.save(reservation.get());
	}


}

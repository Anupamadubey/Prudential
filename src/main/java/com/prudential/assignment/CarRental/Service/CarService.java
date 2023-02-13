package com.prudential.assignment.CarRental.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.prudential.assignment.CarRental.DAO.CarRepository;
import com.prudential.assignment.CarRental.Entity.Car;


@Service
public class CarService {
	
	@Autowired
	private CarRepository carRepository;
	
	public Optional<Car> getCarById(int id) {
		return carRepository.findById(id);
	}
	
	public List<Car> getCars(){
		return carRepository.findAll();
	}
	
	public void updateCar(Car Car,int id) {
		Optional<Car> current = carRepository.findById(id);
		if(current!=null) {
			carRepository.save(Car);
		}
		
	}
	
	public void createCar(Car Car) {
		carRepository.save(Car);
	}
	
	public void deleteCar(int id) {
		carRepository.deleteById(id);
	}

}

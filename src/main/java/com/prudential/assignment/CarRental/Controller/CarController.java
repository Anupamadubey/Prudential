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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prudential.assignment.CarRental.Entity.Car;
import com.prudential.assignment.CarRental.Service.CarService;


@RequestMapping("/cars/")
@RestController
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@GetMapping("/get/car/{id}")
	public Optional<Car> getCarById(@PathVariable  int id) {
		return carService.getCarById(id);
	}
	
	@GetMapping("/getAll")
	public List<Car> getCars(){
		return carService.getCars();
	}
	
	@PutMapping("/update/car/{id}")
	public void updateCar(@RequestBody Car Car, @PathVariable int id) {
		carService.updateCar(Car,id);
	}
	
	@PostMapping("/create/car")
	public void createCar(@RequestBody Car Car) {
		carService.createCar(Car);
	}
	
	@DeleteMapping("/delete/car/{id}")
	public void deleteCar( @PathVariable int id) {
		carService.deleteCar(id);
	}

}

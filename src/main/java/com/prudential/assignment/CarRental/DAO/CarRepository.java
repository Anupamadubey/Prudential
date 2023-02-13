package com.prudential.assignment.CarRental.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prudential.assignment.CarRental.Entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{

}

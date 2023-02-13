package com.prudential.assignment.CarRental.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reservation {

	@Id
	@GeneratedValue
	private Integer reservationId;
	private Date reservationDateTime;
	private Date pickUpDateTime;
	private Date returnDateTime;
	private Integer carId;
	private Integer accountId;
	
	public Integer getReservationId() {
		return reservationId;
	}
	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}
	public Date getReservationDateTime() {
		return reservationDateTime;
	}
	public void setReservationDateTime(Date reservationDateTime) {
		this.reservationDateTime = reservationDateTime;
	}
	public Date getPickUpDateTime() {
		return pickUpDateTime;
	}
	public void setPickUpDateTime(Date pickUpDateTime) {
		this.pickUpDateTime = pickUpDateTime;
	}
	public Date getReturnDateTime() {
		return returnDateTime;
	}
	public void setReturnDateTime(Date returnDateTime) {
		this.returnDateTime = returnDateTime;
	}
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", reservationDateTime=" + reservationDateTime
				+ ", pickUpDateTime=" + pickUpDateTime + ", returnDateTime=" + returnDateTime + ", carId=" + carId
				+ ", accountId=" + accountId + "]";
	}
	
	
	
}

package com.prudential.assignment.CarRental.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prudential.assignment.CarRental.Entity.Account;


@Repository
public interface AccountRepository  extends JpaRepository<Account, Integer> {

}

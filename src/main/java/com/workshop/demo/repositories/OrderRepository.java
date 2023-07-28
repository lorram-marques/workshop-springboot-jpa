package com.workshop.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}

package iuh.fit.se.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import iuh.fit.se.demo.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{
	
}

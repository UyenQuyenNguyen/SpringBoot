package iuh.fit.se.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iuh.fit.se.demo.entities.Flight;
import iuh.fit.se.demo.repositories.FlightRepository;
@Service
public class FlightServiceImpl implements FlightService{
	@Autowired
	FlightRepository flightRes;
	
	
	@Override
	public List<Flight> getAllFlights() {
		return flightRes.findAll();
	}

	@Override
	public Flight addFlight(Flight f) {
		
		return flightRes.save(f);
	}

	@Override
	public boolean deleteFlight(int id) {
		if(flightRes.findById(id) == null) {
			return false;
		}
		
		flightRes.deleteById(id);
		return true;
	}

}

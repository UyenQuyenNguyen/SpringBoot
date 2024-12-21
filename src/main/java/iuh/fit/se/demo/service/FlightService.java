
package iuh.fit.se.demo.service;

import java.util.List;

import iuh.fit.se.demo.entities.Flight;

public interface FlightService {
	public List<Flight> getAllFlights();
	
	public Flight addFlight(Flight f);
	
	public boolean deleteFlight(int id);
}

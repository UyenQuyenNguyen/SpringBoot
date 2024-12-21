package iuh.fit.se.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import iuh.fit.se.demo.entities.Flight;
import iuh.fit.se.demo.service.FlightService;
import jakarta.validation.Valid;
@Controller
public class FlightController {
	@Autowired
	FlightService flightService;
	
	@GetMapping
	public ModelAndView getList(ModelAndView model) {
		List<Flight> flights = flightService.getAllFlights();
		model.setViewName("flight-list");
		model.addObject("flights", flights);
		return model;
	}
	
	@GetMapping("/flight-form")
	public ModelAndView addFlight(ModelAndView model) {
		Flight flight = new Flight();
		model.setViewName("flight-form");
		model.addObject("flight", flight);
		return model;
	}
	
	@PostMapping("/add-flight")
	public String save(@Valid @ModelAttribute() Flight flight, BindingResult result) {
		
		if(flight.getDeparture_date() != null && flight.getArrial_date() != null) {
			if(flight.getDeparture_date().isAfter(flight.getArrial_date())) {
				result.rejectValue("arrial_date", "error.arrial_date" , "Ngày đến phải sau ngày đi");
			}
		}
		
		
		if(result.hasErrors()) {
			return "flight-form";
		}
		
		flightService.addFlight(flight);
		return "redirect:/";
	}
	
	@GetMapping("delete-flight")
	public String search(@RequestParam("flightId") int id) {
		 flightService.deleteFlight(id);
		 return "redirect:/";
	}
}

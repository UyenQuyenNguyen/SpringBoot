package iuh.fit.se.demo.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Flight")
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull(message = "Tên máy bay không được rỗng!")
	private String airplane_name; 
	@NotNull(message = "Điểm đi không được rỗng!")
	@Size(max = 255, min = 3, message = "Điểm đi tối đa 255 ký tự")
	private String departure_airport;
	@NotNull(message = "Điểm đến không được rỗng!")
	@Size(max = 255, min = 3, message = "Điểm đến tối đa 255 ký tự")
	private String arrival_airport;
	
	@NotNull(message = "Ngày đi không được rỗng!")
	@FutureOrPresent(message = "Ngày đi không được ở quá khứ")
	private LocalDate departure_date;
	
	@NotNull(message = "Ngày đến không được rỗng!")
	private LocalDate arrial_date;
	
	@NotNull(message = "Tiền vé không được rỗng!")
	@Min(value = 1, message = "Tiền vé phải lớn hơn 0!")
	private double seat_fare;
	
	@NotNull(message = "Trạng thái không được rỗng!")
	private int flight_status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAirplane_name() {
		return airplane_name;
	}

	public void setAirplane_name(String airplane_name) {
		this.airplane_name = airplane_name;
	}

	public String getDeparture_airport() {
		return departure_airport;
	}

	public void setDeparture_airport(String departure_airport) {
		this.departure_airport = departure_airport;
	}

	public String getArrival_airport() {
		return arrival_airport;
	}

	public void setArrival_airport(String arrival_airport) {
		this.arrival_airport = arrival_airport;
	}

	public LocalDate getDeparture_date() {
		return departure_date;
	}

	public void setDeparture_date(LocalDate departure_date) {
		this.departure_date = departure_date;
	}

	public LocalDate getArrial_date() {
		return arrial_date;
	}

	public void setArrial_date(LocalDate arrial_date) {
		this.arrial_date = arrial_date;
	}

	public double getSeat_fare() {
		return seat_fare;
	}

	public void setSeat_fare(double seat_fare) {
		this.seat_fare = seat_fare;
	}

	public int getFlight_status() {
		return flight_status;
	}

	public void setFlight_status(int flight_status) {
		this.flight_status = flight_status;
	}

	public Flight(int id, String airplane_name,
			@Size(max = 255, min = 3, message = "Điểm tới tối đa 255 ký tự") String departure_airport,
			@Size(max = 255, min = 3, message = "Điểm đến tối đa 255 ký tự") String arrival_airport,
			LocalDate departure_date, LocalDate arrial_date, double seat_fare, int flight_status) {
		super();
		this.id = id;
		this.airplane_name = airplane_name;
		this.departure_airport = departure_airport;
		this.arrival_airport = arrival_airport;
		this.departure_date = departure_date;
		this.arrial_date = arrial_date;
		this.seat_fare = seat_fare;
		this.flight_status = flight_status;
	}

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", airplane_name=" + airplane_name + ", departure_airport=" + departure_airport
				+ ", arrival_airport=" + arrival_airport + ", departure_date=" + departure_date + ", arrial_date="
				+ arrial_date + ", seat_fare=" + seat_fare + ", flight_status=" + flight_status + "]";
	}
	
	
	
}

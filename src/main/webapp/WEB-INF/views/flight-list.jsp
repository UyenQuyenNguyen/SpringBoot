<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Flight</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container d-flex flex-column align-items-center">
		<h1>FLIGHT LIST</h1>
		<h5 class="text-info my-2">21124421 - Nguyen Uyen Quyen</h5>
		<div class="row w-100">
			<div class="col-12 text-end">
				<a href='/flight-form' class="btn btn-primary">Add flight</a>		
			</div>
		</div>
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">Id</th>
		      <th scope="col">Airplan name</th>
		      <th scope="col">Departure Airport</th>
		      <th scope="col">Arrival Airport</th>
			  <th scope="col">Departure Date</th>
			  <th scope="col">Arrival Date</th>
			  <th scope="col">Seat Fare</th>
			  <th scope="col">Flight Status</th>
			  <th scope="col">Tools</th>
		    </tr>
		  </thead>
		  <tbody>
				<c:forEach var="flight" items="${flights}">
					<c:url var="deleteLink" value="/delete-flight">
						<c:param name="flightId" value="${flight.id}" />
					</c:url>
				
					<tr>
						<td>${flight.id}</td>
						<td>${flight.airplane_name}</td>
						<td>${flight.departure_airport}</td>
						<td>${flight.arrival_airport}</td>
						<td>${flight.departure_date}</td>
						<td>${flight.arrial_date}</td> 	

						<td>${flight.seat_fare}</td>
						<td>
							${flight.flight_status == 1 ? "New" : "Scheduled"}
						</td>
						<td>
							<c:if test="${flight.flight_status == 1}">
								<a href="${deleteLink}" onClick="if(!(confirm('Are you sure you want to delete this flight?')))return false">Delete</a>
							</c:if>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
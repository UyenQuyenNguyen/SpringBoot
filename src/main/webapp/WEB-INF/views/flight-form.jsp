<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
		<h5 class="text-info">21124421 - Nguyen Uyen Quyen</h5>
		<h1>ADD FLIGHT</h1>
		
		<form:form role="form" action="/add-flight" modelAttribute="flight">
			<div class="row justify-content-center">
				<div class="col-8 mt-2">
					<form:label path="airplane_name" class="text-info">Airplane name</form:label>
					<form:select path="airplane_name" class="form-control">
						<form:option value="Airbus 001">Airbus 001</form:option>
						<form:option value="Airbus 002">Airbus 002</form:option>
						<form:option value="Boeing 0001">Boeing 0001</form:option>
						<form:option value="Boeing 0002">Boeing 0002</form:option>
						<form:errors path="airplane_name"/>
					</form:select>
				</div>
				
				<div class="col-8 mt-2">
					<form:label path="departure_airport" class="text-info">Departure Airport</form:label>
					<form:input path="departure_airport" class="form-control"/>
					<form:errors path="departure_airport" class="text-error"/>

				</div>
				<div class="col-8 mt-2">
					<form:label path="arrival_airport" class="text-info">Arrival Airport</form:label>
					<form:input path="arrival_airport" class="form-control"/>	
					<form:errors path="arrival_airport" class="text-error"/>
				</div>
				<div class="col-8 mt-2">
					<form:label path="departure_date" class="text-info">Departure date</form:label>
					<form:input path="departure_date" type="date" class="form-control"/>	
					<form:errors path="departure_date" class="text-error"/>
				</div>
				<div class="col-8 mt-2">
					<form:label path="arrial_date" class="text-info">Arrival date</form:label>
					<form:input path="arrial_date" type="date" class="form-control"/>	
					<form:errors path="arrial_date" class="text-error"/>
				</div>
				<div class="col-8 mt-2">
					<form:label path="seat_fare" class="text-info">Seat fare</form:label>
					<form:input path="seat_fare" type="number" class="form-control"/>	
					<form:errors path="seat_fare" class="text-error"/>
				</div>
				<div class="col-8 mt-2">
					<form:label path="flight_status" class="text-info">Flight status</form:label>
					<form:select path="flight_status" class="form-control">
						<form:option value="1">New</form:option>
						<form:option value="2">Scheduled</form:option>
					</form:select>
					<form:errors path="flight_status" class="text-error"/>
				</div>
				<div class="col-8 text-right mt-2">
					<a href="/" class="btn btn-secondary">Cancel</a>
					<button class="btn btn-primary" type="submit">Add</button>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>
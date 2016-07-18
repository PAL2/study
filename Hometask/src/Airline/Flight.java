package Airline;

public class Flight {
	private String destination;
	private String flightNumber;
	private String typeOfPlane;
	private String departureTime;
	private String weekDay;

	public Flight(String destination, String flightNumber, String typeOfPlane, String departureTime, String weekDay) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.typeOfPlane = typeOfPlane;
		this.departureTime = departureTime;
		this.weekDay = weekDay;
	}

	public Flight() {
	}

	public String getDestination() {
		return destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getTypeOfPlane() {
		return typeOfPlane;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getWeekDay() {
		return weekDay;
	}

	public void setDestination(String newDestination) {
		destination = newDestination;
	}

	public void setFlightNumber(String newFlightNumber) {
		flightNumber = newFlightNumber;
	}

	public void setTypeOfPlane(String newTypeOfPlane) {
		typeOfPlane = newTypeOfPlane;
	}

	public void setDepartureTime(String newDepartureTime) {
		departureTime = newDepartureTime;
	}

	public void setWeekDay(String newWeekDay) {
		weekDay = newWeekDay;
	}

	public void on() {
		System.out.println("Я лечу в " + destination);

	}

}

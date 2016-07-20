package Airline;

public class Flight {
	private String destination;
	private String flightNumber;
	private String typeOfPlane;
	private String departureTime;
	private String weekDay;
	private int time;

	public Flight(String destination, String flightNumber, String typeOfPlane, String departureTime, String weekDay,
			int time) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.typeOfPlane = typeOfPlane;
		this.departureTime = departureTime;
		this.weekDay = weekDay;
		this.time = time;
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

	public int getTime() {
		return time;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
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

	public void setTime(int newTime) {
		time = newTime;
	}

	public void larnaka() {
		if ((this.getDestination()).equals("Ларнака")) {
			System.out.println(getDestination() + "\t\t " + getFlightNumber() + " \t\t" + getTypeOfPlane() + " \t"
					+ getDepartureTime() + "\t " + getWeekDay());
		}

	}

	public void london() {
		if ((this.getDestination()).equals("Лондон")) {
			System.out.println(getDestination() + "\t\t " + getFlightNumber() + " \t\t" + getTypeOfPlane() + " \t"
					+ getDepartureTime() + "\t " + getWeekDay());
		}
	}

	public void wednesday() {
		if ((this.getWeekDay()).equals("Среда")) {
			System.out.println(getDestination() + "\t\t " + getFlightNumber() + " \t\t" + getTypeOfPlane() + " \t"
					+ getDepartureTime() + "\t " + getWeekDay());
		}

	}

	public void saturday() {
		if ((this.getWeekDay()).equals("Суббота")) {
			System.out.println(getDestination() + "\t\t " + getFlightNumber() + " \t\t" + getTypeOfPlane() + " \t"
					+ getDepartureTime() + "\t " + getWeekDay());
		}
	}

	public void wednesdayFirstHalf() {
		if ((this.getWeekDay()).equals("Среда") && (0 <= this.getTime()) && (this.getTime() <= 1200)) {
			System.out.println(getDestination() + "\t\t " + getFlightNumber() + " \t\t" + getTypeOfPlane() + " \t"
					+ getDepartureTime() + "\t " + getWeekDay());
		}

	}

	public void wednesdaySecondHalf() {
		if ((this.getWeekDay()).equals("Среда") && (1201 <= this.getTime()) && (this.getTime() <= 2400)) {
			System.out.println(getDestination() + "\t\t " + getFlightNumber() + " \t\t" + getTypeOfPlane() + " \t"
					+ getDepartureTime() + "\t " + getWeekDay());
		}
	}

	public void saturdayFirstHalf() {
		if ((this.getWeekDay()).equals("Суббота") && (0 <= this.getTime()) && (this.getTime() <= 1200)) {
			System.out.println(getDestination() + "\t\t " + getFlightNumber() + " \t\t" + getTypeOfPlane() + " \t"
					+ getDepartureTime() + "\t " + getWeekDay());
		}

	}

	public void saturdaySecondHalf() {
		if ((this.getWeekDay()).equals("Суббота") && (1201 <= this.getTime()) && (this.getTime() <= 2400)) {
			System.out.println(getDestination() + "\t\t " + getFlightNumber() + " \t\t" + getTypeOfPlane() + " \t"
					+ getDepartureTime() + "\t " + getWeekDay());
		}
	}
}
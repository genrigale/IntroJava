package by.epam.classes_and_objects.task10.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Airline {

	private static SimpleDateFormat stringToDate = new SimpleDateFormat("HH:mm");
	private String destinationName;
	private int flightNumber;
	private String plane;
	private Date departureTime;
	private Day dayOfWeek;

	public Airline(String destinationName, int flightNumber, String plane, Date departureTime, Day dayOfWeek) {
		this.destinationName = destinationName;
		this.flightNumber = flightNumber;
		this.plane = plane;
		this.departureTime = departureTime;
		this.dayOfWeek = dayOfWeek;
	}

	public static SimpleDateFormat getStringToDate() {
		return stringToDate;
	}

	public static void setStringToDate(SimpleDateFormat stringToDate) {
		Airline.stringToDate = stringToDate;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getPlane() {
		return plane;
	}

	public void setPlane(String plane) {
		this.plane = plane;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Day getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(Day dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public String toString() {
		return "Авиарейс [пункт назначения = " + destinationName + ", номер рейса = " + flightNumber
				+ ", тип самолета = " + plane + ", время отправления = " + stringToDate.format(departureTime)
				+ ", день вылета = " + dayOfWeek + "]";
	}

}

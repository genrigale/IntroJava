package by.epam.classes_and_objects.task10.entity;

import java.util.ArrayList;
import java.util.List;

public class Airport {

	private List<Airline> airlines; 
	
	public Airport() {
		airlines = new ArrayList<>();
	}

	public List<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}

	@Override
	public String toString() {
		return "Airport [airlines=" + airlines + "]";
	}
	
	
	
}

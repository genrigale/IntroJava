package by.epam.classes_and_objects.task10.logic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import by.epam.classes_and_objects.task10.entity.Airline;
import by.epam.classes_and_objects.task10.entity.Airport;
import by.epam.classes_and_objects.task10.entity.Day;

public class Logic {

	/*список рейсов для заданного пункта назначения*/
	public List<Airline> airlinesToDestinationPoint(Airport airport, String dest) {
		List<Airline> result = new ArrayList<>();

		for (int i = 0; i < airport.getAirlines().size(); i++) {
			if (airport.getAirlines().get(i).getDestinationName().equals(dest)) {
				result.add(airport.getAirlines().get(i));
			}
		}
		return result;
	}

	/* список рейсов для заданного дня недели*/
	public List<Airline> airlinesAtSomeDayOfWeek(Airport airport, Day day) {
		List<Airline> result = new ArrayList<>();

		for (int i = 0; i < airport.getAirlines().size(); i++) {
			if (airport.getAirlines().get(i).getDayOfWeek().name().equals(day.name())) {
				result.add(airport.getAirlines().get(i));
			}
		}
		return result;
	}

	/*список рейсов для заданного дня недели, время вылета для которых больше заданного*/
	public List<Airline> airlinesAtSomeDayOfWeekAfterSomeTime(Airport airport, Date time, Day day) {
		List<Airline> result = new ArrayList<>();

		for (int i = 0; i < airport.getAirlines().size(); i++) {
			if (airport.getAirlines().get(i).getDayOfWeek().name().equals(day.name())) {
				if (airport.getAirlines().get(i).getDepartureTime().after(time)) {
					result.add(airport.getAirlines().get(i));
				}
			}
		}

		return result;
	}

}

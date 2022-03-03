package by.epam.composition.task05.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.composition.task05.entity.Client;
import by.epam.composition.task05.entity.Tour;
import by.epam.composition.task05.entity.TravelAgency;

public class WorkWithClient {

	private Client client;
	private TravelAgency travelAgency;

	public WorkWithClient(Client client, TravelAgency travelAgency) {
		this.client = client;
		this.travelAgency = travelAgency;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public TravelAgency getTravelAgency() {
		return travelAgency;
	}

	public void setTravelAgency(TravelAgency travelAgency) {
		this.travelAgency = travelAgency;
	}

	@Override
	public String toString() {
		return "WorkWithClient [client=" + client + ", travelAgency=" + travelAgency + "]";
	}

	/*
	 * предлагаем клиенту туры, в зависимости от типа поездки, предпочитаемого
	 * транспорта, типа питания и длительности
	 */
	public List<Tour> chooseTours() {
		List<Tour> result = new ArrayList<>();

		for (int i = 0; i < travelAgency.getTours().size(); i++) {
			if (travelAgency.getTours().get(i).getPurpose().name().equalsIgnoreCase(client.getPurpose())
					&& travelAgency.getTours().get(i).getTransport().name().equalsIgnoreCase(client.getTransport())
					&& travelAgency.getTours().get(i).getFood().name().equalsIgnoreCase(client.getFood())
					&& travelAgency.getTours().get(i).getDuration() == client.getDuration()) {

				result.add(travelAgency.getTours().get(i));

			}
		}
		return result;
	}

}

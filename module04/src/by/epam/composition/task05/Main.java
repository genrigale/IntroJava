package by.epam.composition.task05;

import java.util.ArrayList;
import java.util.List;

import by.epam.composition.task05.entity.Client;
import by.epam.composition.task05.entity.Food;
import by.epam.composition.task05.entity.Purpose;
import by.epam.composition.task05.entity.Tour;
import by.epam.composition.task05.entity.Transport;
import by.epam.composition.task05.entity.TravelAgency;
import by.epam.composition.task05.logic.WorkWithClient;

public class Main {
	
	/*5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать 
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок. */

	public static void main(String[] args) {

		List<Tour> tours = new ArrayList<>();
		tours.add(new Tour("Podgorica", Purpose.RECREATION, Transport.TRAIN, Food.BB, 7));
		tours.add(new Tour("London", Purpose.EXCURSION, Transport.PLANE, Food.RO, 10));
		tours.add(new Tour("Berlin", Purpose.TREATMENT, Transport.PLANE, Food.AI, 21));
		tours.add(new Tour("Paris", Purpose.SHOPING, Transport.PLANE, Food.RO, 5));
		tours.add(new Tour("Barcelona", Purpose.CRUISE, Transport.SHIP, Food.AI, 30));
		tours.add(new Tour("New-York", Purpose.SHOPING, Transport.PLANE, Food.RO, 5));
		tours.add(new Tour("Rome", Purpose.EXCURSION, Transport.PLANE, Food.BB, 7));
		tours.add(new Tour("Warsaw", Purpose.EXCURSION, Transport.AUTO, Food.HB, 7));

		TravelAgency travelAgency = new TravelAgency(tours);

		System.out.println("Список путешесвий:");
		for (Tour tour : travelAgency.getTours()) {
			System.out.println("\t" + tour);
		}
		
		System.out.println("============================================================================================");

		Client client = new Client("Ivanov", "shoping", "plane", "ro", 5);
		System.out.println("Клиент " + client.getSurname() + " желает получить список туров по критериям. "
				+ "Тип поездки: " + client.getPurpose() + ". Вид транспорта: " + client.getTransport()
				+ ". Тип питания: " + client.getFood() + ". Длительность поездки: " + client.getDuration() + ".");

		WorkWithClient workWithClient = new WorkWithClient(client, travelAgency);

		List<Tour> listTours = workWithClient.chooseTours();

		System.out.println("Список подходящих путешесвий:");
		for (Tour tour : listTours) {
			System.out.println("\t" + tour);
		}
		
		System.out.println("============================================================================================");
		
		travelAgency.sortToursByDuration();
		
		System.out.println("Список путешесвий после сортировки по длительности (по-возрастанию):");
		for (Tour tour : travelAgency.getTours()) {
			System.out.println("\t" + tour);
		}

	}

}

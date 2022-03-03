package by.epam.classes_and_objects.task10.view;

import java.util.List;

import by.epam.classes_and_objects.task10.entity.Airline;

public class OutputForList {
	
	/*вывод списка*/
	public static void printList(List<Airline> list) {
		for(Airline airline : list) {
			System.out.println("\t" + airline);
		}
	}

}

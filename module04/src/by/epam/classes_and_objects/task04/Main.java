package by.epam.classes_and_objects.task04;

import java.text.ParseException;
/*4.  Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления. 
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по 
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
Добавьте  возможность  сортировки  массив  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами 
назначения должны быть упорядочены по времени отправления.*/

import by.epam.classes_and_objects.task04.entity.Train;
import by.epam.classes_and_objects.task04.logic.Logic;


public class Main {

	public static void main(String[] args) throws ParseException {
		Train[] trains = new Train[] {
				new Train("Moscow", 15, Train.getStringToDate().parse("12:11")),       /*Создаем массив из 5 поездов*/
				new Train("Slyck", 111, Train.getStringToDate().parse("05:31")),
				new Train("Moscow", 14, Train.getStringToDate().parse("09:11")),
				new Train("Brest", 4, Train.getStringToDate().parse("01:15")),
				new Train("Vitebsk", 2, Train.getStringToDate().parse("10:30"))};
		
		System.out.println("Поезда: ");
		for(Train train : trains) {
			System.out.println("\t"+train);
		}
		
		Logic logic = new Logic(); /*Вспомагательный класс для реализации логики работы с Train-объектами*/
		
		Train[] sortedTrainsByNumber = logic.sortByTrainNumbers(trains); /*Сортироввка по номеру поезда*/
		
		System.out.println("Поезда, отсортированные по номеру: ");
		for(Train train: sortedTrainsByNumber) {
			System.out.println("\t"+train);
		}
		
		System.out.println("Информация о поезде по его номеру: ");
		logic.getTrainInfoByNumber(trains, 15);				/*получаем информацию о поезде по его номеру*/
		
		
		Train[] sortedTrainsByDestName = logic.sortByDestName(trains); /*сортировка по имени и времени отправления поезда*/
		
		System.out.println("Поезда, отсортированные по имени и времени отправления: ");
		for(Train train: sortedTrainsByDestName) {
			System.out.println("\t"+train);
		}
	}

}

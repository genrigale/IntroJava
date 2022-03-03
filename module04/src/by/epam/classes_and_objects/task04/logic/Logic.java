package by.epam.classes_and_objects.task04.logic;

import by.epam.classes_and_objects.task04.comparator.DestNameComparator;
import by.epam.classes_and_objects.task04.comparator.TrainNumberComparator;
import by.epam.classes_and_objects.task04.entity.Train;

public class Logic {	
	
	 /*сортировка по номеру поезда*/
	public Train[] sortByTrainNumbers(Train[] trains) {   
		Train[] sortedTrains = trains;		
		/*компаратор для сравнения по номеру поезда*/
		TrainNumberComparator trainNumberComparator = new TrainNumberComparator();
		boolean sorted = false;
		
		while(!sorted) {
			sorted = true;
			for(int i = 0; i < sortedTrains.length - 1; i++) {
				if(trainNumberComparator.compare(sortedTrains[i], sortedTrains[i+1]) > 0) {
					Train temp = sortedTrains[i];
					sortedTrains[i] = sortedTrains[i+1];
					sortedTrains[i+1] = temp;
					sorted = false;
				}
			}
			
		}
		return sortedTrains;
	}
	
	/*получаем информацию о поезде по его номеру*/
	public void getTrainInfoByNumber(Train[] trains, int number) {
		for(int i = 0; i < trains.length; i++) {
			if(trains[i].getTrainNumber() == number) {
				System.out.println("\tНайден поезд под номером " 
			+ trains[i].getTrainNumber() + " -> " + " пункт назначения - " + trains[i].getDestName() 
			+ ", время отправления - " + Train.getStringToDate().format(trains[i].getDepartureTime()));
			}
		}
	}
	
	/*сортировка по имени и времени отправления поезда*/
	public Train[] sortByDestName(Train[] trains) {
		Train[] sortedtrains = trains;
		/*компаратор для сравнения по имени*/
		DestNameComparator destNameComparator = new DestNameComparator();
		boolean sorted = false;
		
		while(!sorted) {
			sorted = true;
			
			for(int i = 0; i < sortedtrains.length - 1; i++) {
				if(!trains[i].getDestName().equals(trains[i+1].getDestName())) {
					if(destNameComparator.compare(trains[i], trains[i+1]) > 0) {                         
						Train temp = trains[i];
						trains[i] = trains[i+1];
						trains[i+1] = temp;
						sorted = false;
					}
				}else {
					if(trains[i].getDepartureTime().after(trains[i+1].getDepartureTime())) {
						Train temp = trains[i];
						trains[i] = trains[i+1];
						trains[i+1] = temp;
						sorted = false;
					}
				}
			}
		}		
		return sortedtrains;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

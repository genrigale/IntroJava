package by.epam.classes_and_objects.task04.comparator;

import java.util.Comparator;

import by.epam.classes_and_objects.task04.entity.Train;

public class TrainNumberComparator implements Comparator<Train>{

	@Override
	public int compare(Train train1, Train train2) {
		if(train1.getTrainNumber() > train2.getTrainNumber()) {
			return 1;
		}
		
		if(train1.getTrainNumber() < train2.getTrainNumber()) {
			return -1;
		}
		
		return 0;
	}

}

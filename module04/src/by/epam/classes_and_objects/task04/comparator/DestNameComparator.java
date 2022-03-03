package by.epam.classes_and_objects.task04.comparator;

import java.util.Comparator;

import by.epam.classes_and_objects.task04.entity.Train;

public class DestNameComparator implements Comparator<Train>{

	@Override
	public int compare(Train train1, Train train2) {
		return train1.getDestName().compareTo(train2.getDestName());
	}

}

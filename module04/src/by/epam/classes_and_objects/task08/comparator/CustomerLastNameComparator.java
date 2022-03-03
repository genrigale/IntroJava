package by.epam.classes_and_objects.task08.comparator;

import java.util.Comparator;

import by.epam.classes_and_objects.task08.entity.Customer;

public class CustomerLastNameComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {		
		return o1.getLastName().compareTo(o2.getLastName());
	}

	

	
}

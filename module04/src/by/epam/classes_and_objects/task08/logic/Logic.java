package by.epam.classes_and_objects.task08.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.classes_and_objects.task08.comparator.CustomerLastNameComparator;
import by.epam.classes_and_objects.task08.entity.Customer;
import by.epam.classes_and_objects.task08.entity.CustomerDatabase;

public class Logic {

	
	public void alphabeticSort(CustomerDatabase customerDatabase) {
		
		CustomerLastNameComparator customerLastNameComparator = new CustomerLastNameComparator();
		boolean isSorted = false;
		
		while(!isSorted) {
			isSorted = true;
			
			for(int i = 0; i < customerDatabase.getCustomers().size() - 1; i++) {
				if(customerLastNameComparator.compare(customerDatabase.getCustomers().get(i), 
						customerDatabase.getCustomers().get(i+1)) > 0) {
					
					isSorted = false;
					Customer temp = customerDatabase.getCustomers().get(i);
					customerDatabase.getCustomers().set(i, customerDatabase.getCustomers().get(i+1));
					customerDatabase.getCustomers().set(i+1, temp);
				}
			}
		}
		
	}
	
	public List<Customer> customersByCreditCardNumberInterval(CustomerDatabase customerDatabase, int from, int to){
		List<Customer> result = new ArrayList<>();
		
		for(int i = 0; i < customerDatabase.getCustomers().size(); i++) {
			if(customerDatabase.getCustomers().get(i).getCreditCardNumber() >= from 
					&& customerDatabase.getCustomers().get(i).getCreditCardNumber() <= to) {
				result.add(customerDatabase.getCustomers().get(i));
			}
		}
		
		return result;
	}

}

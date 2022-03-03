package by.epam.classes_and_objects.task08.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomerDatabase {
	
	private List<Customer> customers;
	
	public CustomerDatabase() {
		this.customers = new ArrayList<>();
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "CustomerDatabase [customers=" + customers + "]";
	}

	
	

}

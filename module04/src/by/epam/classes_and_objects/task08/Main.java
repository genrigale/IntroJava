package by.epam.classes_and_objects.task08;

import java.util.List;

import by.epam.classes_and_objects.task08.entity.Customer;
import by.epam.classes_and_objects.task08.entity.CustomerDatabase;
import by.epam.classes_and_objects.task08.logic.Logic;

public class Main {

	/*
	 * 8. Создать класс Customer, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
	 * агрегирующий массив типа Customer, с подходящими конструкторами и методами.
	 * Задать критерии выбора данных и вывести эти данные на консоль.
	 * 
	 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки,
	 * номер банковского счета. Найти и вывести: a) список покупателей в алфавитном
	 * порядке; b) список покупателей, у которых номер кредитной карточки находится
	 * в заданном интервале
	 */

	public static void main(String[] args) {

		CustomerDatabase customerDatabase = new CustomerDatabase();
		customerDatabase.getCustomers().add(new Customer(114, "Иванов", "Могилев", 2, 44114411));
		customerDatabase.getCustomers().add(new Customer(118, "Сидоров", "Могилев", 11, 55111155));
		customerDatabase.getCustomers().add(new Customer(5587, "Алексеев", "Гродно", 4, 66116611));
		customerDatabase.getCustomers().add(new Customer(1549, "Ломоносов", "Волковыск", 7, 77122779));
		customerDatabase.getCustomers().add(new Customer(2233, "Лобанов", "Береза", 17, 44114411));
		customerDatabase.getCustomers().add(new Customer(3366, "Быков", "Минск", 15, 77992244));
		customerDatabase.getCustomers().add(new Customer(7746, "Купитман", "Орша", 19, 44114411));

		System.out.println("Исходный список клиентов:");
		for (Customer customer : customerDatabase.getCustomers()) {
			System.out.println("\t" + customer);
		}

		Logic logic = new Logic();

		logic.alphabeticSort(customerDatabase);

		System.out.println("==================================================");

		System.out.println("Список отсортирован по алфавиту:");
		for (Customer customer : customerDatabase.getCustomers()) {
			System.out.println("\t" + customer);
		}

		System.out.println("==================================================");

		List<Customer> customersListByCreditCardNumber = logic.customersByCreditCardNumberInterval(customerDatabase, 10,
				20);

		System.out.println("Список клиентов по номерам карт определенного диапазона:");
		for (Customer customer : customersListByCreditCardNumber) {
			System.out.println("\t" + customer);
		}

	}

}

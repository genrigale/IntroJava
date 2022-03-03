package by.epam.oop.task02;

import java.util.ArrayList;
import java.util.List;

import by.epam.oop.task02.Payment.Product;

public class Main {

	/*
	 * 02. Создать класс Payment с внутренним классом, с помощью объектов которого
	 * можно сформировать покупку из нескольких товаров.
	 */

	public static void main(String[] args) {
		
		
		List<Product> products = new ArrayList<>();
		products.add(new Payment().new Product("Tide", 15));
		products.add(new Payment().new Product("Snickers", 3));
		products.add(new Payment().new Product("Fairy", 4));
		products.add(new Payment().new Product("Хлеб", 1));
		products.add(new Payment().new Product("Мыло", 5));
		products.add(new Payment().new Product("Мука", 3));
		products.add(new Payment().new Product("Кофе", 10));
		products.add(new Payment().new Product("Чай", 7));
		
		
		Payment payment = new Payment(products);
		
		System.out.println("Список покупок:");
		for(Product product: products) {
			System.out.println("\t" + product);
		}
		
		System.out.println("К оплате: " + payment.getTotalPrice());
	}

}

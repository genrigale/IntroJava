package by.epam.classes_and_objects.task09;

import java.util.List;

import by.epam.classes_and_objects.task09.entity.Author;
import by.epam.classes_and_objects.task09.entity.Book;
import by.epam.classes_and_objects.task09.entity.BookStore;
import by.epam.classes_and_objects.task09.logic.Logic;

public class Main {
	
	/*9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и 
		метод    toString().  Создать  второй  класс,  агрегирующий  массив  типа  Book,  с  подходящими  конструкторами  и 
		методами. Задать критерии выбора данных и вывести эти данные на консоль.  
		 
		Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.  
		Найти и вывести:  
		a) список книг заданного автора;  
		b) список книг, выпущенных заданным издательством;  
		c) список книг, выпущенных после заданного года. 
*/

	public static void main(String[] args) {
		
		BookStore bookStore = new BookStore();		
		bookStore.getBooks().add(new Book("Двенадцать стульев", new Author[] {new Author("Ильф"), new Author("Петров")}, "Фламинго", 2007, 400, 600.0, "твердый"));
		bookStore.getBooks().add(new Book("Дневник", new Author[] {new Author("Паланик")}, "Фламинго", 2004, 410, 300.0, "мягкий"));
		bookStore.getBooks().add(new Book("Огнем и мечем", new Author[] {new Author("Сенкевич")}, "Фламинго", 1998, 730, 640.0, "твердый"));
		bookStore.getBooks().add(new Book("Битва королей", new Author[] {new Author("Мартин")}, "Фламинго", 1996, 1200, 800.0, "твердый"));
		bookStore.getBooks().add(new Book("Униженные и оскорбленные", new Author[] {new Author("Достоевский")}, "АСТ", 1997, 350, 420.0, "мягкий"));
		bookStore.getBooks().add(new Book("Преступление и наказание", new Author[] {new Author("Достоевский")}, "Эксмо", 2001, 600, 560.0, "твердый"));
		
		System.out.println("Список книг:");
		for(Book book : bookStore.getBooks()) {
			System.out.println("\t"+book);
		}
		
		System.out.println("====================================================");
		
		Logic logic = new Logic();
		
		List<Book> booksByAuthor = logic.bookListByAuthor(bookStore, "Достоевский");
		
		System.out.println("Список книг конкретного автора:");
		for(Book book : booksByAuthor) {
			System.out.println("\t"+book);
		}
		
		System.out.println("====================================================");
		
		List<Book> booksByPublisher = logic.bookListByPublisher(bookStore, "Фламинго");
		
		System.out.println("Список книг конкретного издателя:");
		for(Book book : booksByPublisher) {
			System.out.println("\t"+book);
		}
		
		System.out.println("====================================================");
		
		List<Book> booksByDate = logic.bookListByDate(bookStore, 1998);
		
		System.out.println("Список книг выпущенных после заданного года:");
		for(Book book : booksByDate) {
			System.out.println("\t"+book);
		}
	}

}

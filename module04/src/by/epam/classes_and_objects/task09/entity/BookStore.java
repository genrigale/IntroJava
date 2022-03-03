package by.epam.classes_and_objects.task09.entity;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
	
	private List<Book> books;

	public BookStore() {
		this.books = new ArrayList<>();
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "BookStore [books=" + books + "]";
	}
		

}

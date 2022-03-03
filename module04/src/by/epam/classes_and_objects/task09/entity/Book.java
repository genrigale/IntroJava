package by.epam.classes_and_objects.task09.entity;

import java.util.Arrays;

public class Book {

	private static int counter = 1;
	private final int ID = counter++;

	private String bookName;
	private Author[] authors;
	private String publishingHouse;
	private int year;
	private int pages;
	private double price;
	private String binding;

	public Book(String bookName, Author[] authors, String publishingHouse, int year, int pages, double price,
			String binding) {

		this.bookName = bookName;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.binding = binding;
	}

	public int getID() {
		return ID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	@Override
	public String toString() {
		return "Книга [id= " + ID + ", название = " + bookName + ", автор(ы) = " + Arrays.toString(authors)
				+ ", издательство = " + publishingHouse + ", год издания = " + year + ", количество страниц = " + pages
				+ ", цена = " + price + ", переплет = " + binding + "]";
	}

}

package by.epam.classes_and_objects.task09.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.classes_and_objects.task09.entity.Book;
import by.epam.classes_and_objects.task09.entity.BookStore;

public class Logic {
	
	public List<Book> bookListByAuthor(BookStore bookStore, String lastNameOfAuthor){
		List<Book> result = new ArrayList<>();
		
		for(int i = 0; i < bookStore.getBooks().size(); i++) {
			for(int j = 0; j < bookStore.getBooks().get(i).getAuthors().length; j++) {
				if(bookStore.getBooks().get(i).getAuthors()[j].getLastName().equals(lastNameOfAuthor)) {
					result.add(bookStore.getBooks().get(i));
				}
			}
		}
		return result;
	}
	
	public List<Book> bookListByPublisher(BookStore bookStore, String publisher){
		List<Book> result = new ArrayList<>();
		
		for(int i = 0; i < bookStore.getBooks().size(); i++) {
			if(bookStore.getBooks().get(i).getPublishingHouse().equals(publisher)) {
				result.add(bookStore.getBooks().get(i));
			}
		}
		return result;
	}
	
	
	public List<Book> bookListByDate(BookStore bookStore, int year){
		List<Book> result = new ArrayList<>();
		
		for(int i = 0; i < bookStore.getBooks().size(); i++) {
			if(bookStore.getBooks().get(i).getYear() > year) {
				result.add(bookStore.getBooks().get(i));
			}
		}
		return result;
	}
	
	

}

package by.epam.classes_and_objects.task02;

public class Main {
	
	/* 02.  Создйте  класс  Test2  двумя  переменными.  Добавьте  конструктор  с  входными  параметрами.  
	 * Добавьте конструктор, инициализирующий члены класса по умолчанию.
	 *  Добавьте set- и get- методы для полей экземпляра класса. */

	public static void main(String[] args) {
		
		Test2 first = new Test2("Sidorov", 31); // конст со входными параметрами
		Test2 second = new Test2(); // по-умолчанию
		
		System.out.println(first);
		System.out.println(second);
		
		System.out.println("================================================");
		
		System.out.println("Фамилия объекта first: " + first.getName());
		first.setName("Petrov");
		System.out.println("Фамилия объекта first после изменения: " + first.getName());
	}

}

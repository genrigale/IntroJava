package by.epam.classes_and_objects.task05;

public class Main {
	
	/*5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение 
		на  единицу  в  заданном  диапазоне.  Предусмотрите инициализацию  счетчика  значениями  по  умолчанию  и 
		произвольными  значениями. Счетчик  имеет  методы  увеличения  и  уменьшения  состояния,  и  метод 
		позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.*/

	public static void main(String[] args) {
		Logic logic = new Logic(); // вспомагательный класс для работы с объектами Counter
		
		System.out.println("Мною обозначен диапазон, при котором значения счетчика можно увеличить/уменьшить: ");
		System.out.println("\tот " + Counter.MIN_VAL + " до " + Counter.MAX_VAL);
		System.out.println("Если значение счетчика не относится к вышеуказанному диапазону, то будет возвращено его текущее значение.");
		
		System.out.println("==============================================================================================================");
		
		System.out.println("Инициализация по-умолчанию (счетчик counter1): ");
		Counter counter1 = new Counter();
		System.out.println("\tЗначение счетчика counter1 по-умолчанию -> " + logic.getInfo(counter1)); // 0
		
		System.out.println("==============================================================================================================");
		
		System.out.println("Инициализация определенным значением (счетчик counter2): ");
		Counter counter2 = new Counter(10);
		System.out.println("\tЗначение счетчика counter2 после инициализации определенным значением -> " + logic.getInfo(counter2)); // 10
		
		System.out.println("==============================================================================================================");	
		
		System.out.println("Инициализация значением, выходящим за пределы диапазона (счетчик counter3): ");
		Counter counter3 = new Counter(12);
		System.out.println("\tЗначение счетчика counter3 после инициализации -> " + logic.getInfo(counter3)); // 12
		
		System.out.println("==============================================================================================================");
		
		System.out.println("Увеличиваем значение счетчика counter1: ");
		System.out.println("\tЗначение счетчика counter1 до увеличения -> " + logic.getInfo(counter1));
		logic.increaseCounterValue(counter1);		
		System.out.println("\tЗначение счетчика counter1 после увеличения -> " + logic.getInfo(counter1));
		
		System.out.println("==============================================================================================================");
		
		System.out.println("Уменьшаем значение счетчика counter2: ");
		System.out.println("\tЗначение счетчика counter2 до уменьшения -> " + logic.getInfo(counter2));
		logic.decreaseCounterValue(counter2);		
		System.out.println("\tЗначение счетчика counter2 после уменьшения -> " + logic.getInfo(counter2));
		
		System.out.println("==============================================================================================================");
		
		System.out.println("Уменьшаем значение счетчика counter3: ");
		System.out.println("\tЗначение счетчика counter3 до уменьшения -> " + logic.getInfo(counter3));
		logic.decreaseCounterValue(counter3);		
		System.out.println("\tЗначение счетчика counter3 после уменьшения -> " + logic.getInfo(counter3));
		
		System.out.println("==============================================================================================================");
		
		

	}

}

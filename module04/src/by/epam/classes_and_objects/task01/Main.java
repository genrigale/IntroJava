package by.epam.classes_and_objects.task01;

public class Main {
	/* 01.  Создайте  класс  Test1  двумя  переменными.  Добавьте  метод  вывода  на  экран  и  методы  изменения  этих 
	переменных. Добавьте метод, который находит сумму  значений этих  переменных, и  метод, который находит 
	наибольшее значение из этих двух переменных.  */

	public static void main(String[] args) {
		
		Test1 test1 = new Test1();
		test1.setA(12); // присвоили переменной a -> 12
		test1.setB(5); // // присвоили переменной b -> 5
		
		System.out.println("Объект test1: " + test1); // выводим на экран объект и его поля
		System.out.println("Наибольше значение: " + test1.max(test1.getA(), test1.getB()));		
		System.out.println("Сумма его полей = " + test1.sum(test1.getA(), test1.getB()));
		
		
		
	}

}

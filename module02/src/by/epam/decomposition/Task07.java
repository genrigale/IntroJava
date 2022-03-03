package by.epam.decomposition;

import java.util.ArrayList;
import java.util.List;

public class Task07 {
//	07. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9. 
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		fillList(list);
		System.out.println("Исходный ряд чисел: " + list);
		
		removeEven(list);
		System.out.println("Удалены четные числа: " + list);
		
		int sumOfFactorials = 0;
		for(int i = 0; i < list.size(); i++) {
			sumOfFactorials += factorialSearch(list.get(i));  // поиск суммы факториалов нечетных чисел
		}
		
		System.out.println("Сумма факториалов нечетных чисел от 1 до 9 = " + sumOfFactorials + ".");
		
		
	}

	// заполнение от 1 до 9
	public static List<Integer> fillList(List<Integer> list) {
		for (int i = 0; i < 9; i++) {
			list.add(i + 1);
		}
		return list;
	}
	
	// удаление четных элементов
	public static List<Integer> removeEven(List<Integer> list){
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) % 2 == 0) {
				list.remove(list.get(i));
			}
		}
		return list;
	}
	
	// поиск факториала числа
	public static int factorialSearch(int number) {
		int fact = 1;
		
		if(number == 0 || number == 1) {
			return fact;
		}
		
		for(int i = 1; i <= number; i++) {
			fact *= i;
		}
		
		return fact;
	}

}

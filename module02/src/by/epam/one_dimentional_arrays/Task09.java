package by.epam.one_dimentional_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task09 {

	public static void main(String[] args) {
		
		// 09. В массивве целых чисел найти наиболее часто встречающееся число
		// Если таких чисел несколько - определить наименьшее.

		int[] a = new int[] { 2, 3, 2, 4, 10, 5, 6, 5 }; // исходный массив
		System.out.println("Исходный массив: " + Arrays.toString(a));
		Arrays.sort(a); // сортируем по возрастанию
		System.out.println("Массив после сортировки: " + Arrays.toString(a));

		findEquals(a);
		findMinElement(findEquals(a));

	}

	// поиск повторяющихся элементов
	public static List<Integer> findEquals(int[] array) { 
		List<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				numbers.add(array[i]);
			}
		}
		return numbers;

	}

	// поиск меньшего среди повторяющихся элементов
	public static void findMinElement(List<Integer> list) { 
		if (list.isEmpty()) {
			System.out.println("Нет повторяющихся значений.");
			return;
		}
		
		if(list.size() == 1) {
			System.out.println("Найден один повторяющийся элемент: " + list);
			return;
		}

		int min = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
			}
		}
		System.out.println("Наиболее часто встречающиеся числа: " + list);
		System.out.println("Наименьшее из них: " + min);
	}

}

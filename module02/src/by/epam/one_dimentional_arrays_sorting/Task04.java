package by.epam.one_dimentional_arrays_sorting;

import java.util.Arrays;

public class Task04 {
	// 04. Сортировка обменами (пузырьковая сортировка)
	// Переставить числа последрвательности в порядке возрастания.

	public static void main(String[] args) {
		int[] a = { 4, 1, 5, 8, 7, 3, 9 };
		System.out.println("Исходный массив: " + Arrays.toString(a));
		System.out.println();
		
		int flag;
		int count = 0;
		do {
			flag = 0;
			for(int i = 0; i < a.length - 1; i++) {
				if(a[i] > a[i + 1]) {
					flag++;
					count++;
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}while(flag > 0);
		
		System.out.println();
		System.out.println("Результат: " + Arrays.toString(a));
		System.out.println("Количество перестановок =  " + count);

	}

}

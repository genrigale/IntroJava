package by.epam.decomposition;

import java.util.Arrays;

public class Task02 {
	// 02. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел. 
	
	public static void main(String[] args) {
		int[] a = { 36, 200, 144, 18 };		
		System.out.println("Даны четыре натуральных числа: " + Arrays.toString(a));
		
		////////////////////////////////////////////////////////////////////////
		int i = 2;
		int length = a.length;		
		int nod = findNod(a[0], a[1]); // сначала находим НОД для первых двух чисел, а затем
									   // используем его при проходке по остальным элементам					
		
		
		while(i < length) {   // поиск НОД для элементов массива
			nod = findNod(nod, a[i]);
			i++;
		}
		////////////////////////////////////////////////////////////////////////
		
		System.out.println("Их НОД = " + nod);

	}
	
	// функция поиска НОД для двух чисел
	public static int findNod(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		return a + b;
	}

}

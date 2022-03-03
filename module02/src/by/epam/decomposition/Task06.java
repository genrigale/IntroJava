package by.epam.decomposition;

import java.util.Arrays;

public class Task06 {
//	06. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми. 
	public static void main(String[] args) {
		int[] arr = { 2, 4, 7 };
		System.out.println("Проверим, являются ли эти три числа взаимно простыми: " + Arrays.toString(arr));
		
		///////////////////////////////////////////////////////////////
		int nod = findNod(arr[0], arr[1]);		
		for(int i = 2; i < arr.length; i++) {  // находим НОД для трех чисел
			nod = findNod(nod, arr[i]);
		}
		///////////////////////////////////////////////////////////////
		
		// если НОД равен 1 -> числа взаимно простые
		System.out.println(nod == 1 ? "Числа взаимно простые." : "Числа НЕ взаимно простые.");		
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

package by.epam.decomposition;

import java.util.ArrayList;
import java.util.List;

public class Task12 {
//	12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого 
//	являются числа, сумма цифр которых равна К и которые не большее N. 

	public static void main(String[] args) {
		int k = 4;
		int n = 100;

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i <= n; i++) {
			int sum = getSumOfDigits(i); // проверяем сумму цифр каждого число из перечня на равенство числу k
			if (sum == k) {
				list.add(i); // если условие удовлетворено -> добавляем число в список
			}
		}

		System.out.printf("Ищем числа до %d, сумма цифр которых равна %d.\n", n, k);
		System.out.println("Результат: " + list);

	}

	// метод расчета суммы цифр числа
	public static int getSumOfDigits(int num) {
		char[] arr = String.valueOf(num).toCharArray();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += Character.getNumericValue(arr[i]);
		}
		return sum;
	}

}

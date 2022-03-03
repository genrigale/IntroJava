package by.epam.decomposition;

import java.util.ArrayList;
import java.util.List;

public class Task15 {
	
//	15. Найти  все  натуральные  n-значные  числа,  цифры  в  которых  образуют  строго  возрастающую 
//	последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию. 


	public static void main(String[] args) {
		int n = 3; // колич цифр
		int limit = 1000; // граница поиска

		List<Integer> nDigitNumbers = getNdigitNumbersList(n, limit); // формируем список n-значных чисел до limit
		System.out.println(nDigitNumbers);

		List<Integer> rightOrderNums = removeElemWichNotFit(nDigitNumbers);
		System.out.println(rightOrderNums);

	}

	// находим количество цифр в числе
	public static int getNumberLength(int number) {
		String str = String.valueOf(number);
		return str.length();
	}

	// формируем список n-значных чисел до limit
	public static List<Integer> getNdigitNumbersList(int n, int limit) {
		List<Integer> resultList = new ArrayList<>();

		for (int i = 0; i < limit; i++) {
			int numLength = getNumberLength(i);
			if (numLength == n) {
				resultList.add(i);
			}
		}
		return resultList;
	}

	
	// проверка порядка цифр в числе
	public static boolean checkTheOrderOfTheDigits(int number) {
		char[] arr = String.valueOf(number).toCharArray();
		int[] array = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			array[i] = Character.getNumericValue(arr[i]);
		}

		boolean flag = false;

		while (!flag) {
			flag = true;

			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] >= array[i + 1]) {
					flag = false;
				}
			}

			if (flag == false) {
				break;
			}
		}
		return flag;
	}
	

	// удаление чисел, у которых цифры не в порядке возрастания
	public static List<Integer> removeElemWichNotFit(List<Integer> list) {
		List<Integer> result = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			boolean check = checkTheOrderOfTheDigits(list.get(i));
			if (check == true) {
				result.add(list.get(i));
			}
		}
		return result;

	}

}

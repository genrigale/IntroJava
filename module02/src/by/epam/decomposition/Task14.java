package by.epam.decomposition;

import java.util.ArrayList;
import java.util.List;

public class Task14 {
	// 14. Найти n-значные числа Армстронга от 1 до k.

	public static void main(String[] args) {
		int n = 3;     // количество цифр в числе
		int k = 1000;  // диапазон поиска "до k"
		
		// получаем список n-значных чисел до k
		List<Integer> nDigitNumbers= getNDigitNumbers(n, k);
		
		System.out.printf("Числа Армстронга %d-значные до %d:\n", n, k);
		
		// проверяем, явл ли n-значные числа числами Армстронга и выводим на экран
		for(int i = 0; i < nDigitNumbers.size(); i++) {
			int value = checkNDigitNumber(n, nDigitNumbers.get(i));
			if(value == nDigitNumbers.get(i)) {
				System.out.println(nDigitNumbers.get(i));
			}
		}
	}
	
	// проверяем число цифр в числе
	public static int countDigits(int num) {
		char[] arr = String.valueOf(num).toCharArray();
		return arr.length;
	}
	
	// проверка на число Армстронга
	public static int checkNDigitNumber(int n, int num) {
		char[] arr = String.valueOf(num).toCharArray();		
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			result += (int)(Math.pow(Character.getNumericValue(arr[i]), n));
		}
		return result;
	}
	
	// создаем ряд n-значных чисел от от 1 до k
	public static List<Integer> getNDigitNumbers(int n, int k){
		List<Integer> numbers = new ArrayList<>();		
		for(int i = 1; i < k; i++) {
			int lengthOfNumber = countDigits(i);
			if(lengthOfNumber == n) {
				numbers.add(i);
			}
		}
		return numbers;
	}

}

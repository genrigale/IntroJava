package by.epam.decomposition;

import java.util.ArrayList;
import java.util.List;

public class Task16 {
//	16.  Написать  программу,  определяющую  сумму  n  -  значных  чисел,  содержащих  только  нечетные  цифры. 
//	Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию. 

	public static void main(String[] args) {
		int n = 3; // количество цифр
		int start = 100; // начало поиска
		int end = 1000; // конец поиска
		
		// получаем список n-значных чисел
		List<Integer> nDigitNumbersList = getNDigitNumbersList(start, end, n);		
		
		// получаем список n-значных чисел, состоящих из нечетных цифр
		List<Integer> oddDigitNumbersList = getOddDigitNumbers(nDigitNumbersList);
		
		System.out.printf("Список %d-значных чисел от %d до %d, которые состоят из нечетных цифр: \n", n, start, end);
		System.out.println(oddDigitNumbersList);
		
		// сумма n-значных чисел, состоящих из нечетных цифр
		int sum  = getSum(oddDigitNumbersList);	
		// количество четных цифр в этой сумме
		int countEvenDigitsInTheSum = getCountEvenDigitsInTheNumber(sum);
		
		System.out.println();
		System.out.printf("Сумма этих чисел = %d. \n", sum);
		System.out.printf("Количество четных цифр в этой сумме = %d.", countEvenDigitsInTheSum);
		
		
		
	}
	
	// поиск длины числа
	public static int getNumberLength(int num) {
		String result = String.valueOf(num);
		return result.length();
	}	
	
	// формиркем список n-значных чисел от start до end 
	public static List<Integer> getNDigitNumbersList(int start, int end, int n){
		List<Integer> list = new ArrayList<>();		
			for(int i = start; i < end; i++) {
				int numberLength = getNumberLength(i);
				if(numberLength == n) {
					list.add(i);
				}
			}
		return list;
	}
		
	// проверяем, состоит ли число из нечетных цифр
	public static boolean checkIfNumberHaveOddDigits(int num) {
		char[] arr = String.valueOf(num).toCharArray();
		
		boolean eachDigitIsOdd = false;
		
		while(!eachDigitIsOdd) {
			eachDigitIsOdd = true;
			
			for(int i = 0; i < arr.length; i++) {
				if(Character.getNumericValue(arr[i]) % 2 == 0) {
					eachDigitIsOdd = false;
				}
			}
			
			if(eachDigitIsOdd == false) {
				break;
			}
		}
		return eachDigitIsOdd;
	}
	
	// получаем список n-значных чисел, состоящих из нечетных цифр
	public static List<Integer> getOddDigitNumbers(List<Integer> list) {
		List<Integer> result = new ArrayList<>();
		for(int i = 0; i < list.size(); i++) {
			boolean check = checkIfNumberHaveOddDigits(list.get(i));
			if(check == true) {
				result.add(list.get(i));
			}
		}
		return result;
	}
	
	// сумма n-значных чисел, состоящих из нечетных цифр
	public static int getSum(List<Integer> list) {
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
	
	// количество четных цифр в сумме
	public static int getCountEvenDigitsInTheNumber(int number) {
		int count = 0;
		char[] arr = String.valueOf(number).toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if(Character.getNumericValue(arr[i]) % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

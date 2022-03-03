package by.epam.decomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13 {
//	13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
//	Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для 
//	решения задачи использовать декомпозицию.

	public static void main(String[] args) {
		
		int[] arr = fillingArray(30); // заполняем массив числами от 0 до n
			
		boolean[] primeNumbers = new boolean[arr.length]; // вспомагательный массив, позволяющий исключить составные числа
		Arrays.fill(primeNumbers, true);				  // по-умоляанию все значения true	
	
		List<Integer> primeNumbersList = getPrimeNumbers(arr, primeNumbers);  // получаем список простых чисел
		
		primeTwins(primeNumbersList); // узнаем какие пары простых чисел до n отличаются на 2
		
	}
	
	// заполняем массив интов числами от 0 до n
	public static int[] fillingArray(int n) {
		if(n < 2) {
			return null;
		}
		
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = i;
		}
		System.out.println("Ищем простые числа от " + 0 + " до " + n + ", которые отличаются друг от друна на 2: ");
		return array;
	}
	
	// получаем список простых чисел от 0 до n
	public static List<Integer> getPrimeNumbers(int[] intArray, boolean[] boolArray){
		for(int i = 2; i < intArray.length; i++) {
			for(int j = i * 2; j < boolArray.length; j += i) {
				boolArray[j] = false;
			}
		}
		
		List<Integer> primeList = new ArrayList<>();
		
		for(int i = 2; i < boolArray.length; i++) {
			if(boolArray[i] == true) {
				primeList.add(intArray[i]);
				
			}
		}
		
		return primeList;
	}
	
	// узнаем какие пары простых чисел от 0 до n отличаются на 2
	public static void primeTwins(List<Integer> list) {
		for(int i = 0; i < list.size() - 1; i++) {
			if((Math.abs(list.get(i) - list.get(i + 1))) == 2) {
				System.out.println(list.get(i) + " и " + list.get(i + 1));
			}
		}
		
	}
	
	
	
	
	
	

}

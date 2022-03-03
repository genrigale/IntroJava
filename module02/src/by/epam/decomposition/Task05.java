package by.epam.decomposition;

import java.util.Arrays;

public class Task05 {
//	05. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, 
//	   которое меньше максимального элемента массива, но больше всех других элементов).
	public static void main(String[] args) {
		int[] a = { 4, 5, 111, 1, 7, 8, 3, 6, 11, 65, 98, 54, 111 };
		System.out.println("Исходный массив: " + Arrays.toString(a));		
		bubbleSort(a);
		System.out.println("Упорядоченный массив: "+ Arrays.toString(a));
		System.out.println("Второе по величне число = " + almostMaxNumber(a));
	}
	
	// фунукция сортировки масссива по возрастанию
	public static int[] bubbleSort(int[] arr) {
		boolean sorted = false;
		
		while(!sorted) {
			sorted = true;			
			for(int i = 0; i < arr.length - 1; i++) {
				if(arr[i] > arr[i+1]) {
					sorted = false;
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		return arr;
	}
	
	// функция поиска второго по величине числа в массиве
	public static int almostMaxNumber(int[] arr) {
		int maxElem = arr[arr.length - 1];
		int almostMax = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			int j = i - 1;
			if (arr[i] < maxElem && arr[i] > arr[j]) {
				almostMax = arr[i];
				break;
			}
		}
		return almostMax;
	}

}

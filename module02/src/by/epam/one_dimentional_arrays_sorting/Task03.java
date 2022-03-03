package by.epam.one_dimentional_arrays_sorting;

import java.util.Arrays;

public class Task03 {

//	03. Сортировка выбором. Дана возрастающая последовательность чисел. Требуется переставить элементы так, 
//	чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший 
//	элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура 
//	повторяется. Написать алгоритм сортировки выбором. 

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(Arrays.toString(arr));
		System.out.println();

		for (int position = 0; position < arr.length; position++) {
			int index = maxIndex(arr, position);
			int temp = arr[position];
			arr[position] = arr[index];
			arr[index] = temp;			
		}
		System.out.println(Arrays.toString(arr));

	}

	public static int maxIndex(int[] array, int start) {
		int maxValue = array[start];
		int maxInd = start;

		for (int i = start + 1; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
				maxInd = i;
			}
		}
		return maxInd;
	}

}

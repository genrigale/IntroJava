package by.epam.decomposition;

import java.util.Arrays;

public class Task08 {
	
//	08. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
//	Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов 
//	массива с номерами от k до m. 


	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Массив: " + Arrays.toString(a));

		System.out.println("Сумма трех элементов =  " + sumOfThreeElements(a, 1));

	}

	// подсчет суммы трех элементов, начиная с k
	public static int sumOfThreeElements(int[] arr, int k) {
		int m = 3;

		if (k < 0) {
			return -1;     // начальный индекс не может быть меньне нуля
		}	

		int sum = 0;
		for (int i = k; i < k + m; i++) {

			// если введенный индекс меньше третьего с конца и не равен последнему,
			// то суммируем элементы на текущем и последнем индексах
			// т.е. это ситуация, когда приходится складывать меньше трех элементов ->
			// -> значит складываем что есть
			if (i > arr.length - 3 && i != arr.length - 1) {  // 
				sum = arr[i] + arr[i + 1];
				break;
			}
			
			// если индекс является последним -> возвращаем только этот элемент
			if (i == arr.length - 1) {
				sum = arr[i];
				break;
			}

			sum += arr[i]; // во всех остальных случаях суммируем три элемента
		}
		return sum;
	}

}

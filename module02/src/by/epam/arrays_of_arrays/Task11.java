package by.epam.arrays_of_arrays;

import java.util.Arrays;

public class Task11 {
//	11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в 
//	которых число 5 встречается три и более раз.
	
	public static void main(String[] args) {
		int sizeI = 10;
		int sizeJ = 20;

		int[][] a = new int[sizeI][sizeJ];

		for (int i = 0; i < sizeI; i++) {
			for (int j = 0; j < sizeJ; j++) {
				a[i][j] = (int) (Math.random() * 16);
			}
			System.out.println(Arrays.toString(a[i]));
		}
		
		System.out.println();
		
		for (int i = 0; i < sizeI; i++) {
			
			int countFives = 0;
			for (int j = 0; j < sizeJ; j++) {
				if(a[i][j] == 5) {
					countFives++;
				}
			}
			
			if(countFives >= 3) {
				System.out.println("Строка " + i + " содержит 3 и более пятерок.");
			}			
		}

	}

}

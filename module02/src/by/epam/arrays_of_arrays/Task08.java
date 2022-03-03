package by.epam.arrays_of_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
//	08.  В числовой матрице поменять местами два любых столбца, т. е. 
//	все элементы одного столбца поставить на соответствующие им позиции другого, 
//	а его элементы второго переместить в первый. Номера столбцов вводит 
//	пользователь с клавиатуры.

	public static void main(String[] args) {
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		int n = 4;
		int[][] a = new int[n][n];
		int item = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) { // заполняем массив 4*4
				a[i][j] = item;
				item++;
			}
			System.out.println(Arrays.toString(a[i]));
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////

		Scanner s = new Scanner(System.in);
		System.out.println("Введите номера двух столбцов (от 0 до 3): ");
		int firstColumn = s.nextInt();
		int secondColumn = s.nextInt();
		s.close();
		
		if(firstColumn == secondColumn) {
			System.out.println("Номера колонок не должны быть равны !");
			return;
		}
		
		if(firstColumn < 0 || firstColumn > n - 1) {
			System.out.println("Номера колонок должны быть от 0 до 3!");
			return;
		}

		if(secondColumn < 0 || secondColumn > n - 1) {
			System.out.println("Номера колонок должны быть от 0 до 3!");
			return;
		}		

		for (int i = 0; i < n; i++) {
			int temp = a[i][firstColumn];
			a[i][firstColumn] = a[i][secondColumn];
			a[i][secondColumn] = temp;
		}

		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println(Arrays.toString(a[i]));
		}

	}

}

package by.epam.arrays_of_arrays;

public class Task01 {
	// 01. Дана матрица. Вывести на экран все нечетные столбцы,
	// у которых первый элемент больше последнего.

	public static void main(String[] args) {
		int[][] a = { { 1, 5, 2 }, 
					  { 0, 3, 6 }, 
					  { 9, 2, 4 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {				
					System.out.print(a[i][j] + " ");				
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(j % 2 != 0) {
					if(a[0][j] > a[a.length - 1][j]) {
						System.out.println(a[i][j]);
					}
				}
			}
		}
	
		
		

	}
}

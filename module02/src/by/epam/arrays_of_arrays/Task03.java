package by.epam.arrays_of_arrays;

public class Task03 {
	// 03. Дана матрица. Вывести k-строку и p-столбец.

	public static void main(String[] args) {
		int[][] a = { { 1, 5, 2, 7 }, 
				      { 0, 3, 6 }, 
				      { 9, 2, 4 } };

		System.out.println("Матрица: ");
		System.out.println();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		
		int k = 0; // строка
		int p = 2; // столбец
		
		System.out.print("Строка k: ");	
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(i == k) {
					System.out.print(a[i][j] + " ");
				}	
			}		
		}
		System.out.println();
		System.out.println();
				
		System.out.println("Столбец p: ");
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(j == p) {
					System.out.print(a[i][j] + " ");
				}				
				
			}
			System.out.println();			
		}
		
		
		
		
		

	}
}

package by.epam.arrays_of_arrays;

public class Task02 {
	// 02. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

	public static void main(String[] args) {
		int[][] a = { { 1, 5, 2 }, 
					  { 0, 3, 6 }, 
					  { 9, 2, 4 } };
		
		System.out.println("Квадратная матрица: ");	
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {					
					System.out.print(a[i][j] + " ");								
			}
			System.out.println();			
		}
		
		System.out.println();		
		
		System.out.println("Главная диагональ: ");		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i][i]);
		}
		
		System.out.println();
		
		System.out.println("Побочная диагональ: ");
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i][a.length - 1 - i]);
		}
		
		// 2-Й ВАРИАНТ ВЫВОДА ГЛАВНОЙ И ПОБОЧНОЙ ДИАГОНАЛЕЙ
//		System.out.println();
//		
//		for(int i = a.length - 1; i >= 0; i--) {
//			System.out.println(a[i][a.length - 1 - i]);
//		}
//		
//		System.out.println();
//		
//		for(int i = a.length - 1; i >= 0; i--) {
//			System.out.println(a[i][i]);
//		}
		
		
		
		

	}
}

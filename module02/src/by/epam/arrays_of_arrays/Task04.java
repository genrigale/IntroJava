package by.epam.arrays_of_arrays;

public class Task04 {
	// 04. Сформировать квадратную матрицу порядка n(четное число).
	// 1 2 3 ... n
	// n n-1 n-2 ... 1
	// 1 2 3 ... n
	// ... ... ... ... ...

	public static void main(String[] args) {
		int n = 4;
		int[][] a = new int[n][n];

		// заполняем четные строки значениями вида: 1 2 3 4
		int item = 1;
		int index = 0;
		while (item <= n) {
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					a[i][index] = item;
				}
			}
			item++;
			index++;
		}

		// заполняем нечетные строки значениями вида: 4 3 2 1
		int item2 = n;
		int index2 = 0;
		while (item2 >= 1) {
			for (int i = 0; i < n; i++) {
				if (i % 2 != 0) {
					a[i][index2] = item2;
				}
			}
			item2--;
			index2++;
		}

		// вывод массива
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}

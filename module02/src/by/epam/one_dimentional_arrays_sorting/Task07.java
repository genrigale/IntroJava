package by.epam.one_dimentional_arrays_sorting;

public class Task07 {
	// 07. Пусть даны две неубывающие последовательности действительных чисел.
	// Требуется указать те места, на которые нужно вставлять элементы второй
	// последовательности в первую последовательность так, чтобы новая
	// последовательность оставалась
	// возрастающей.

	public static void main(String[] args) {
		printLocation(new double[] { 1, 7, 8, 9 }, new double[] { 2, 3, 4, 5, 6, 10 });
	}

	private static void printLocation(double[] array1, double[] array2) {
		for (int i = 0; i < array1.length; i++) {
			boolean flag = true;
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] < array2[j]) {
					System.out.printf("%d елемент первого масс. вставим до %d элем. второго\n", i, j);
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.printf("%d елемент первого масс. вставим после последенго элем. второго\n", i);
		}
	}

}

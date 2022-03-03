package by.epam.one_dimentional_arrays;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		// 02. Дана последовательность действительных чисел.
		// Заменить все её члены, большие данного z, этим числом.
		// Подсчитать количество замен.

		double z = 17.1; // взято за эталон для сравнения
		int count = 0; // счетчик замен 

		Random random = new Random();

		double[] array = new double[10]; // массив действительных чисел емкостью 10

		for (int i = 0; i < array.length; i++) { // заполнение массива псевдослучайными числами от 0 до 50
			array[i] = random.nextDouble() * 50;
		}

		System.out.println("Последовательность из десяти действительных чисел от 0 до 50:");
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println();
		System.out.println("=====================================================");

		for (int i = 0; i < array.length; i++) { // поиск чисел, больших z и замена их на z
			if (array[i] > z) {
				array[i] = z;
				count++;		// увеличение счетчика при удачной замене 
			}
		}

		System.out.println("Количество замен = " + count + ".");

		System.out.println("=====================================================");
		System.out.println();

		System.out.println("Последовательность действительных чисел ПОСЛЕ ЗАМЕНЫ: ");
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}

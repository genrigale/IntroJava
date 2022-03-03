package by.epam.decomposition;

import java.util.Arrays;

public class Task10 {
//	10.  Дано  натуральное  число  N.  Написать  метод(методы)  для  формирования  массива,  элементами  которого 
//	являются цифры числа N.

	public static void main(String[] args) {
		int a = 1268;
		System.out.println("Дано число " + a + ".");
		System.out.println("Цифры числа " + a + " представлены в массиве: " + Arrays.toString(getDigitsOfNumber(a)));
	}

	public static int[] getDigitsOfNumber(int number) {
		char[] arr = String.valueOf(number).toCharArray();
		int[] digits = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
				digits[i] = Character.getNumericValue(arr[i]);
		}
		
		return digits;
	}

}

package by.epam.string_and_stringbuilder;

public class Task01 {
//	01. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

	public static void main(String[] args) {
		String string = "In God      we           trust.";
		System.out.println(countMaxSpaces(string));

	}

	public static int countMaxSpaces(String input) {
		int max = 0;
		int count = 0;

		for (char item : input.toCharArray()) {
			if (item == ' ') {
				count++;
				if (count > max) {
					max = count;
				}
			} else {
				count = 0;
			}
		}
		return max;
	}

}

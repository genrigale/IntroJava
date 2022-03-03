package by.epam.string_and_stringbuilder;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task07 {
//	 07. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde 
//	 def", то должно быть выведено "abcdef".

	public static void main(String[] args) {
		String src = "abc cde def";

		System.out.println("Было: " + src);
		System.out.println("Стало: " + removeCopies(src));

	}

	public static StringBuilder removeCopies(String str) {
		char[] arr = str.toCharArray();
		StringBuilder result = new StringBuilder();

		LinkedHashSet<Character> chars = new LinkedHashSet<>(); // убрали дубликаты
		for (int i = 0; i < arr.length; i++) {
			chars.add(arr[i]);
		}

		List<Character> listChars = new ArrayList<>(); // убрали пробелы
		for (Character ch : chars) {
			if (ch != ' ') {
				listChars.add(ch);
			}
		}

		for (int i = 0; i < listChars.size(); i++) { // переложили все в строку
			result.append(listChars.get(i));
		}
		return result;
	}

}
package by.epam.string_and_stringbuilder;

public class Task06 {
//	06. Из заданной строки получить новую, повторив каждый символ дважды.

	public static void main(String[] args) {
		String src = "World";
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < src.length(); i++) {
			result.append(src.charAt(i)); 
			result.append(src.charAt(i));
		}

		System.out.println(result);

	}

}

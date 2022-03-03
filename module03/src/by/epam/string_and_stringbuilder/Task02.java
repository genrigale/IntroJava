package by.epam.string_and_stringbuilder;

public class Task02 {
//	02. В строке вставить после каждого символа 'a' символ 'b'. 

	public static void main(String[] args) {
		String string = "uasa";
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < string.length(); i++) {
			result.append(string.charAt(i));
			if (string.charAt(i) == 'a') {
				result.append('b');
			}
		}

		System.out.println(string);
		System.out.println(result);

	}

}

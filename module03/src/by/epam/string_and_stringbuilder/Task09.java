package by.epam.string_and_stringbuilder;

public class Task09 {

	public static void main(String[] args) {

		String src = "TODO Auto-generated method stub";
		char[] charArray = src.toCharArray();

		int countUpper = 0;
		int countLower = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isLowerCase(charArray[i])) {
				countLower++;
			}
			if (Character.isUpperCase(charArray[i])) {
				countUpper++;
			}
		}
		System.out.println("Дана строка: " + src);
		System.out.printf("Строчных букв -> %d, прописных -> %d.", countLower, countUpper);

	}

}

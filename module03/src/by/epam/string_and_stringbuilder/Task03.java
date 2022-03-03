package by.epam.string_and_stringbuilder;

public class Task03 {
//	03. Проверить, является ли заданное слово палиндромом.

	public static void main(String[] args) {
		String str = "Казак";
		System.out.println("Слово " + str + " палиндром? => " + isPalindrom(str));

	}

	
		public static boolean isPalindrom(String input) {
		char[] inputChar = input.toCharArray();
		
		for(int i = 0; i < inputChar.length / 2; i++) {
			if(inputChar[i] == inputChar[inputChar.length - 1 - i]) {
				return true;
			}
		}
		return false;
	}

}

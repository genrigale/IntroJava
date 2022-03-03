package by.epam.string_and_stringbuilder;

public class Task10 {
//	10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным 
//	знаком. Определить количество предложений в строке X.

	public static void main(String[] args) {
		String  src = "Hello, World! How are you? Java one love.";
		
		int countSentence = 0;
		
		for(int i = 1; i < src.length(); i++) {
			if((src.charAt(i) == '!' || src.charAt(i) == '?' || src.charAt(i) == '.') 
					&& src.charAt(i) != src.charAt(i - 1)) {
				countSentence++;
			}
		}
		
		System.out.println("Дана строка: " + src);
		System.out.printf("Количество предложений = %d.", countSentence);
		

	}

}

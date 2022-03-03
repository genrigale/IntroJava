package by.epam.strings_and_char_array;

public class Task02 {
//	2. Замените в строке все вхождения 'word' на 'letter'. 

	public static void main(String[] args) {
		String string = "Word word is large much many of word.";
		System.out.println(string);
		System.out.println(replaceWords(string));

	}

	public static StringBuilder replaceWords(String string) {
		StringBuilder result = new StringBuilder();
		
		String[] array = string.split(" ");
		for(int i = 0; i < array.length; i++) {
			if(array[i].equalsIgnoreCase("word") || array[i].equalsIgnoreCase("word.") || array[i].equalsIgnoreCase("word,")) {
				array[i] = "letter";
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			result.append(array[i] + " "); 
		}
		return result;
	}
	
}

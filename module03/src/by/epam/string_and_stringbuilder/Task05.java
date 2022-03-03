package by.epam.string_and_stringbuilder;

public class Task05 {
//	5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
	public static void main(String[] args) {
		String src = "Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.";
		System.out.println("Буква " + "\"а\" встречается " + getCountLetter(src) + " раз.");
		
	}
	
	public static int getCountLetter(String src) {
		char[] arr = src.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'а') {
				count++;
			}
		}
		return count;
	}

}

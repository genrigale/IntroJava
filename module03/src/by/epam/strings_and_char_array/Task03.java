package by.epam.strings_and_char_array;

public class Task03 {
//	03. В строке найти количество цифр. 


	public static void main(String[] args) {
		String string = "Hello. I have 3 questions. 1 - what time is it? 2 - where is the money? 3 - who is on duty today?";
		System.out.println(string);
		System.out.println("Количество цифр = " + getDigitsCount(string));

	}
	
	public static int getDigitsCount(String string) {
		char[] arr = string.toCharArray();
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(Character.isDigit(arr[i])) {
				count++;
			}
		}
		return count;		
	}

}

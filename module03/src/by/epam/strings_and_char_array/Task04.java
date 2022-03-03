package by.epam.strings_and_char_array;

public class Task04 {
//	04. В строке найти количество чисел.

	public static void main(String[] args) {
		String string = "Шутки за 300, шутки за 400.";
		System.out.println("Исходная строка: " + string);
		System.out.println("Количество чисел = " + countNumbers(string));

	}
	
	
	public static int countNumbers(String input) {
	    int count = 0;
	    boolean previousIsDigit = false;

	    for (int i = 0; i < input.length(); i++) {
		        if (Character.isDigit(input.charAt(i))) {
			            if (!previousIsDigit) {
			                count++;
			                previousIsDigit = true;
			            }
		        } else {
		            previousIsDigit = false;
		        }
	    }
	    return count;
	}
	

}

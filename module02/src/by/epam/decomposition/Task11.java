package by.epam.decomposition;

public class Task11 {
//	11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр. 
	public static void main(String[] args) {
		int a = 1268;
		int b = 101315;
		
		System.out.printf("Даны числа %d и %d.\n", a, b);
		compareTwoNumbers(a, b);

	}

	public static void compareTwoNumbers(int a, int b) {
		String s1 = String.valueOf(a); 
		String s2 = String.valueOf(b); 
		System.out.println(s1.length() > s2.length() ? "Число " + a + " имеет больше цифр."
				: "Число " + b + " имеет больше цифр.");
	}

}

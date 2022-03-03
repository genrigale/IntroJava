package by.epam.loop;

public class Task06 {

	// 06. Вывести на экран соответствия между символами и их численнными
	// обозначениями в памяти компьютера.

	public static void main(String[] args) {
		char ch1 = '@';
		char ch2 = '$';
		char ch3 = '%';
		char ch4 = '&';

		int symbol1 = ch1;
		int symbol2 = ch2;
		int symbol3 = ch3;
		int symbol4 = ch4;

		System.out.println("Чиленные обозначения символов в памяти компьютера: ");
		System.out.println(ch1 + " = " + symbol1);
		System.out.println(ch2 + " = " + symbol2);
		System.out.println(ch3 + " = " + symbol3);
		System.out.println(ch4 + " = " + symbol4);

	}

}

package by.epam.line_program;

public class Task04 {
	// 04. Дано действительное число r вида nnn.mmm (три цифры в дробной и целой
	// частях).
	// Поменять местами дробную и целую части. Вывести полученноке значение на
	// экран.

	public static void main(String[] args) {
		double r = 431.685; // исходное число
		String result; // здесь представим результат перестановки

		// превращаем исходное число в массив типа char
		char[] array = String.valueOf(r).toCharArray();

		// механизм перестановки цифр(символов) согласно условию
		for (int i = 0; i < array.length / 2; i++) {
			char temp;
			temp = array[i];
			array[i] = array[array.length / 2 + i + 1];
			array[array.length / 2 + i + 1] = temp;
		}

		result = new String(array); // приводим измененный массив array к строковому виду
		
		System.out.println("Исходное число: " + r);
		System.out.println("Итог замены: " + result);

	}

}

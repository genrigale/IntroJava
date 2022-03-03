package by.epam.one_dimentional_arrays_sorting.task08;

public class MainApp {

	public static void main(String[] args) {
		/////////////////////////////////////////////////////////////////
		Fraction f1 = new Fraction(2, 3);
		Fraction f2 = new Fraction(4, 4);
		Fraction f3 = new Fraction(1, 2);
												// заполняем массив объектами класса Fraction
		Fraction[] array = new Fraction [3];
		array[0] = f1;
		array[1] = f2;
		array[2] = f3;
		////////////////////////////////////////////////////////////////
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println();
		
		
		// поиск общего знаменателя
		System.out.println("Общий знаменатель: " + commonDenominator(array));
		System.out.println();
		
		// изменяем знаменатель в каждом объекте массива
		int denominator = commonDenominator(array);		
		setCommonDenominator(array, denominator);
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		// сортировка
		sortFraction(array);
		
		System.out.println();
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	// функция поиска общего знаменателя
	public static int commonDenominator(Fraction[] array) {
		int result = 1;
		for(int i = 0; i < array.length; i++) {
			result *= array[i].getDenominator();
		}
		return result;
	}
	
	// функция установки общего знаменателя
	public static Fraction[] setCommonDenominator(Fraction[] array, int denominator) {
		for(int i = 0; i < array.length; i++) {
			array[i].setDenominator(denominator);
		}
		return array;
	}
	
	// сортировка массива дробей по возрастанию
	public static Fraction[] sortFraction(Fraction[] array) {			
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i].getNumerator() > array[j].getNumerator()) {
					Fraction temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

}

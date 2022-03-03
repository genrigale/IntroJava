package by.epam.line_program;

public class Task03 {
	// 03. Вычислить значение выражения (все поля - действительные числа):
	// 
	
	public static void main(String[] args) {
		double result; // итог
		double rigthPart; // часть выражения справа от знака умнножение
		double leftPart;	// часть выражения слева от знака умнножение
		double x = 30.0; // угол 30 градусов
		double y = 90.0; // угол 90 градусов
		
		rigthPart = (Math.cos(Math.toRadians(x - y)) - Math.cos(Math.toRadians(x + y))) / 
						(Math.cos(Math.toRadians(x - y)) + Math.cos(Math.toRadians(x + y)));
		
		leftPart = (Math.sin(Math.toRadians(x)) + Math.cos(Math.toRadians(y))) / 
						(Math.cos(Math.toRadians(x)) - Math.sin(Math.toRadians(y)));
		
		result = leftPart * rigthPart;		

		
		System.out.println("Значение выражения = " + result);
		
	}

}

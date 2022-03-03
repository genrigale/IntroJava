package by.epam.decomposition;

public class Task09 {
//	9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, 
//	если угол между сторонами длиной X и Y— прямой. 


	public static void main(String[] args) {
		double x = 10;
		double y = 6;
		double z = 4;
		double t = 10;

		double diagonal = diagInFrontOfXandY(x, y); // диагональ 4х-угольника - она же гипотенуза напротив угла в 90
													// градусов

		double halfPerimeter1 = halfPerimeter(x, y, diagonal); // полупериметр 1го треугольника
		double halfPerimeter2 = halfPerimeter(z, t, diagonal); // полупериметр 2го треугольника

		double square1 = squareOfTriangle(x, y, diagonal, halfPerimeter1); // площадь 1го треугольника
		double square2 = squareOfTriangle(z, t, diagonal, halfPerimeter2); // площадь 2го треугольника

		double result = square1 + square2;

		System.out.printf("Дан четырехугольник со сторонами %.1f, %.1f, %.1f и %.1f.\n", x, y, z, t);
		System.out.printf("Его площадь = %.1f.", result);

	}

	// находим диагональ, которая делит 4-угольник на 2 треугльника
	public static double diagInFrontOfXandY(double x, double y) {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	// расчет полупериметра треугольника
	public static double halfPerimeter(double a, double b, double c) {
		return (a + b + c) / 2;
	}

	// расчет площади треугольника
	public static double squareOfTriangle(double a, double b, double c, double halfPerimeter) {
		return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
	}

}

package by.epam.decomposition;

public class Task03 {
//	03.  Вычислить  площадь  правильного  шестиугольника  со  стороной  а,  используя  метод  вычисления  площади 
//	треугольника.

	public static void main(String[] args) {
		double a = 5;
		double squareTriangle = triangleSquare(a); // нашли площадь одного треугольника
		double squareHexagon = squareTriangle * 6; // нашли площадь гексагона

		System.out.printf("Дана сторона шестиугольника, равная %.2f.\n", a);
		System.out.println("Шестиугольник включает 6 равносторонних треугольников.");
		System.out.println("Найдя площадь одного треугольника, найдем площадь гексагона.");
		System.out.println();
		System.out.printf("Площадь шестиугольника = %.2f.", squareHexagon);

	}

	// площадь правильного треугольника
	public static double triangleSquare(double value) {
		return (Math.sqrt(3) / 4) * Math.pow(value, 2); // по формуле
	}

}

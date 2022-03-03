package by.epam.classes_and_objects.task07;

import by.epam.classes_and_objects.task07.entity.Coord;
import by.epam.classes_and_objects.task07.entity.Triangle;
import by.epam.classes_and_objects.task07.logic.Logic;

public class Main {

	/*
	 * 7. Описать класс, представляющий треугольник. Предусмотреть методы для
	 * создания объектов, вычисления площади, периметра и точки пересечения медиан.
	 */

	public static void main(String[] args) {
		/* координаты точек */
		Coord coordA = new Coord(2, 1);
		Coord coordB = new Coord(1, 6);
		Coord coordC = new Coord(3, 4);

		/* длины сторон */
		int ab = 10;
		int bc = 7;
		int ca = 9;

		/* вспомагательный класс */
		Logic logic = new Logic();

		/* треугольник */
		Triangle triangle = new Triangle(ab, bc, ca, coordA, coordB, coordC);

		int halfPerimOfTriangle = logic.halfPerimeter(triangle);
		int areaOfTriangle = logic.area(halfPerimOfTriangle, triangle);
		int perim = logic.perimeter(triangle);
		Coord medianIntersecPoint = logic.medianIntersectionPoint(triangle);

		System.out.println("Информация о треугольнике: " + triangle);
		System.out.printf("Площадь треугольника = %d.\n", areaOfTriangle);
		System.out.printf("Периметр треугольника = %d.\n", perim);
		System.out.println("Точка пересечения медиан: " + medianIntersecPoint);

	}

}

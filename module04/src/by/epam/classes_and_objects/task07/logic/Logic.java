package by.epam.classes_and_objects.task07.logic;

import by.epam.classes_and_objects.task07.entity.Coord;
import by.epam.classes_and_objects.task07.entity.Triangle;

public class Logic {

	/*полупериметр треугольника*/
	public int halfPerimeter(Triangle triangle) {
		return (triangle.getSideA() + triangle.getSideB() + triangle.getSideC()) / 2;
	}

	/*площадь теугольника*/
	public int area(int halfPerimeter, Triangle triangle) {
		return (int) Math.sqrt(halfPerimeter * (halfPerimeter - triangle.getSideA())
				* (halfPerimeter - triangle.getSideB()) * (halfPerimeter - triangle.getSideC()));
	}

	/*периметр треугольника*/
	public int perimeter(Triangle triangle) {
		return triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
	}

	public Coord medianIntersectionPoint(Triangle triangle) {
		/*
		 * чтобы найти точку пересечения медиан, нужно вычислить среднее арифметическое
		 * иксов и игриков
		 */
		int x1 = triangle.getCoordA().getX(); // x из точки A
		int x2 = triangle.getCoordB().getX(); // x из точки B
		int x3 = triangle.getCoordC().getX(); // x из точки C

		int y1 = triangle.getCoordA().getY(); // y из точки A
		int y2 = triangle.getCoordB().getY(); // y из точки B
		int y3 = triangle.getCoordC().getY(); // y из точки C

		int avgX = (x1 + x2 + x3) / 3;
		int avgY = (y1 + y2 + y3) / 3;

		return new Coord(avgX, avgY);

	}
}

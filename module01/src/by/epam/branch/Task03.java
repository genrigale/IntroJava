package by.epam.branch;

public class Task03 {
	// 03. Даны три точки: A(x1,y1), B(x2,y2), C(x3,y3).
	// Расположены ли они на одной прямой?

	public static void main(String[] args) {
		// значения точек: (-2, 1), (0, 3), (5, -7)
		System.out.println(isOneLine(-2, 1, 0, 3, 5, -7));

	}

	public static boolean isOneLine(int x1, int y1, int x2, int y2, int x3, int y3) {
		int result = (x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3); 
		// если result равен 0 -> точки лежат на одной прямой -> true
		// если != 0 -> точки не лежат на одной прямой        -> false
		return result == 0;
	} 

}

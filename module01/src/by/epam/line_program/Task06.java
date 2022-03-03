package by.epam.line_program;

public class Task06 {
	// 06. Если точка с координатами (x, y) принадлежит закрашенной области,
	// программа должна печатать true, иначе - false

	public static void main(String[] args) {
		// это наша исходная точка, которую будем проверять на принадлежность
		int x1 = 6;
		int y1 = 6;

		// точки, которые определяют закрашенную область
		// A
		int x2 = -2;
		int y2 = 4;

		// B
		int x3 = 2;
		int y3 = 4;

		// C
		int x4 = 4;
		int y4 = -3;

		// D
		int x5 = -4;
		int y5 = -3;


		if ((x1 >= x2 && y1 <= y2) && (x1 <= x3 && y1 <= y3) && (x1 <= x4 && y1 >= y4) && (x1 >= x5 && y1 >= y5)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}

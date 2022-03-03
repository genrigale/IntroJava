package by.epam.branch;

public class Task04 {
	// 04. Заданы размеры A, B прямоугольного отверстия и
	// размеры x, y, z кирпича.
	// Пройдет ли кирпич через отверстие?

	public static void main(String[] args) {
		// размеры отверстия
		int a = 10;
		int b = 15;

		// размеры кирпича
		int x = 10;
		int y = 25;
		int z = 15;

		// площадь отверстия
		int holeArea = a * b;
		
		// находим площади двух граней кирпича (он же прямоугольный параллелепипед)
		int brickArea1 = x * y;
		int brickArea2 = x * z;

		// сопоставляем площади граней кирпича и площадь отверстия
		if(brickArea1 == holeArea || brickArea2 == holeArea) {
			System.out.println(true + " - кирпич проходит в отверстие.");
		}else {
			System.out.println(false + " - кирпич не проходит в отверстие.");
		}
	}

}

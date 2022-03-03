package by.epam.decomposition.task04;

public class MainApp {
	// 04. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими 
	//из пар точек самое большое расстояние. Указание. Координаты точек занести в массив. 	

	public static void main(String[] args) {
		Coord a = new Coord("a", 3, 8);
		Coord b = new Coord("b", 5, 6);
		Coord c = new Coord("c", 2, 4);
		Coord d = new Coord("d", -4, 4);
		
		Coord[] arr = { a, b, c, d };

		findMaxDistanceBetweenPoints(arr);

	}

	// функция по нахождения расстояния между двумя точками
	public static double distanceBetweenPoints(Coord item1, Coord item2) {
		double dist = Math.sqrt(Math.pow(item2.getX() - item1.getX(), 2) + Math.pow(item2.getY() - item1.getY(), 2));		
		return dist;
	}
	
	// функция по нахождению максимального расстояния между парами точек
	public static void findMaxDistanceBetweenPoints(Coord[] array) {
		double maxDist = distanceBetweenPoints(array[3], array[0]); 
		
		for(int i = 0; i < array.length-1; i++) {
			double distance = distanceBetweenPoints(array[i], array[i+1]);
			if(distance > maxDist) {
				maxDist = distance;
				System.out.println("Максимальное расстояние между точками " + array[i].getName() + " и " 
							+ array[i+1].getName() + " = " + maxDist + ".");
			}	
		}
		
		System.out.println("Максимальное расстояние между точками " + array[3].getName() + " и " 
				+ array[0].getName() + " = " + maxDist + ".");
	}

	

}

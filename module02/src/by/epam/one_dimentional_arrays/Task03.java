package by.epam.one_dimentional_arrays;

public class Task03 {

	public static void main(String[] args) {
		// 03. Дан массив действительных чисел, размерностью n.
		// Посчитать сколько в нем положительных, отрицательных и нулевых элементов.
		
		int countPositive = 0;
		int countNegative = 0;
		int countZero = 0;
		int n = 10;
		
		double[] array = new double[n];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (Math.random() * 20) - 5; // заполняем действительными числами от -5 до 15
		}
		
		System.out.println("Массив из десяти действительных чисел от -5 до 15: ");
		System.out.println();
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > 0) {
				countPositive++;
			}else if (array[i] < 0) {
				countNegative++;
			}else {
				countZero++;
			}
		}
		
		System.out.println();
		System.out.println("==================================================");
		
		System.out.println("Количество положительных чисел в массиве = " + countPositive + ".");
		System.out.println("Количество отрицательных чисел в массиве = " + countNegative + ".");
		System.out.println("Количество чисел в массиве равных нулю = " + countZero + ".");
		
		
		
		

	}

}

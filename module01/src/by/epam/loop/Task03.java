package by.epam.loop;

public class Task03 {

	// 03. Найти сумму квадратов первых ста чисел.

	public static void main(String[] args) {
		int sum = 0; // здесь будет результат суммирования кваратов первых ста чисел
		
		// в цикле идет перебор чисел от 0 до 99 (всего 100 чисел)
		for(int i = 0; i < 100; i++) {
			sum += i*i; // сюда складываем квадрат каждого числа 
		}
		
		System.out.println(sum);

	}

}

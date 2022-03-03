package by.epam.decomposition;

public class Task17 {
//	17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких 
//	действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию. 


	public static void main(String[] args) {
		int x = 12;
		int count = cyclicSubtraction(x);		
		System.out.printf("Дано число %d. Количество вычитаний до нуля = %d.", x, count);
	}
	
	public static int getSumOfDigits(int num) {
		int sum = 0;		
		while(num != 0) {
			int last = num % 10;
			num /= 10;
			sum += last;
		}
		return sum;		
	}
	
	public static int cyclicSubtraction(int number) {
		int count = 0;
		
		while(number != 0) {
			int sumOfDigits = getSumOfDigits(number);
			number -= sumOfDigits;
			count++;
		}
		return count;
	}

}

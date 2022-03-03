package by.epam.loop;

import java.math.BigInteger;

public class Task04 {

	// 04. Составить программу нахождения произведения квадратов первых двухсот чисел.

	public static void main(String[] args) {
		BigInteger result = BigInteger.valueOf(1); 
				
		for(int i = 1; i <= 200; i++) {
			result = result.multiply(BigInteger.valueOf(i*i));
		}
		
		System.out.println(result);
		
		

	}

}

package by.epam.composition.task02;


import java.util.Arrays;

import by.epam.composition.task02.entity.Car;
import by.epam.composition.task02.entity.Engine;
import by.epam.composition.task02.entity.Wheel;


public class Main {
	/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
менять колесо, вывести на консоль марку автомобиля.  
*/
	public static void main(String[] args) {
		
		
		Car car = new Car(new Engine(2.8), Arrays.asList(new Wheel("Michelin"),new Wheel("Michelin"),new Wheel("Michelin"),new Wheel("Michelin")), "Audi Q2");
		
		System.out.println("Информация о машине:");
		System.out.println("\t" + car);
		System.out.println();
		
		
		car.goByCar();
		System.out.println();
		
		car.refuelTheCar();
		System.out.println();
		
		car.changeWheels("Cooper");
		System.out.println();
		
		System.out.println("Информация о машине после заправки и замены колес:");
		System.out.println("\t" + car);
		System.out.println();
		
		System.out.println("Модель автомобиля -> " + car.getModel());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

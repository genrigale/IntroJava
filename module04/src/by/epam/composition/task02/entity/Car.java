package by.epam.composition.task02.entity;

import java.util.List;

import by.epam.composition.task02.logic.ActionsWithCar;

public class Car implements ActionsWithCar{

	private Engine engine;
	private List<Wheel> wheels;
	private double fuelLevel;
	private String model;	

	public Car(Engine engine, List<Wheel> wheels, String model) {
		this.engine = engine;
		this.wheels = wheels;
		this.fuelLevel = 10; // начальный уровень горючего
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	public double getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	

	@Override
	public String toString() {
		return "Автомобиль [" + engine + ", " + " 4 колеса от " + wheels.get(0) + ", уровень горючего = " + fuelLevel + ", модель авто = " + model
				+ "]";
	}

	@Override
	public void goByCar() {	
		engine.start();
		System.out.println("Начинаем движение.");
	}

	@Override
	public void refuelTheCar() {
		System.out.println("Подъезжаем к заправке.");
		if(fuelLevel <= 10) {
			System.out.println("Горючего осталось " + fuelLevel + " литров. Нужно заправиься");
			System.out.println("Идет заправка.");
			this.setFuelLevel(fuelLevel += 30);
			System.out.println("Горючего в баке = " + fuelLevel + " литров.");
		}else {
			System.out.println("Горючего осталось " + fuelLevel + " литров. Заправка не нужна.");
		}
	}

	@Override
	public void changeWheels(String nameManufacturer) {
		System.out.println("Приехали на шиномонтаж.");
		System.out.println("Заменили колеса " + wheels.get(0) + " на " + nameManufacturer + ".");
		
		for(int i = 0; i < wheels.size(); i++) {
			wheels.get(i).setManufacturer(nameManufacturer);
		}
		
	}
	
	
	

}

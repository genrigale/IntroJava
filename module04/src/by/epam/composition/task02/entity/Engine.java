package by.epam.composition.task02.entity;

public class Engine {

	private double power;

	public Engine(double power) {
		this.power = power;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}
	
	public void start() {
		System.out.println("Заводим двигатель.");
	}
	
	@Override
	public String toString() {
		return "объем двигателя = " + power;
	}

}

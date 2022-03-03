package by.epam.composition.task02.entity;

public class Wheel {

	private String manufacturer;

	public Wheel(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "[" + manufacturer + "]";
	}

}

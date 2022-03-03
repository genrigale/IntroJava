package by.epam.oop.task05A.bean;

public enum Flower {

	TULIP("Тюльпан", 5, 20), 
	ROSE("Красная роза", 7, 20), 
	CHRYSANTEMUM("Хризантема", 4, 20), 
	DAHLIA("Георгин", 6, 20),
	IRIS("Ирис", 7, 20);

	private String name;
	private int unitPrice;
	private int quantity;
	private int orderedQuantity;

	private Flower(String name) {
		this.name = name;
	}

	private Flower(String name, int unitPrice, int quantity) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public int getOrderedQuantity() {
		return orderedQuantity;
	}

	public void setOrderedQuantity(int orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}

	public String getName() {
		return name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

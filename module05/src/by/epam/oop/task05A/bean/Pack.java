package by.epam.oop.task05A.bean;

public enum Pack {

	PLASTIC("Полиэтиленовая упаковка", 11), 
	CRAFT_PAPER("Крафтовая бумага", 15), 
	PAPERBOARD("Картонная упаковка", 13);

	private String name;
	private int price;

	private Pack(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

}

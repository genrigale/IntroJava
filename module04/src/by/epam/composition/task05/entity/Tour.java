package by.epam.composition.task05.entity;

/*экземпляр класса Tour содержит информацию о пункте назначения, цель(тип) поездки,
 * вид транспорта, тип питания, длительность поездки */
public class Tour {
	
	private String destinaton;
	private Purpose purpose;
	private Transport transport;
	private Food food;
	private int duration;
	
	public Tour(String destinaton, Purpose purpose, Transport transport, Food food, int duration) {
		this.destinaton = destinaton;
		this.purpose = purpose;
		this.transport = transport;
		this.food = food;
		this.duration = duration;
	}

	public String getDestinaton() {
		return destinaton;
	}

	public void setDestinaton(String destinaton) {
		this.destinaton = destinaton;
	}

	public Purpose getPurpose() {
		return purpose;
	}

	public void setPurpose(Purpose purpose) {
		this.purpose = purpose;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Tour [destinaton=" + destinaton + ", purpose=" + purpose + ", transport=" + transport + ", food=" + food
				+ ", duration=" + duration + "]";
	}
	

}

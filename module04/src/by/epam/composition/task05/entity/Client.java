package by.epam.composition.task05.entity;

/*клиент обладает именем, представлением о типе поездки, виде транспорта, питании и длительности*/
public class Client {

	private String surname;
	private String purpose;
	private String transport;
	private String food;
	private int duration;

	public Client(String surname, String purpose, String transport, String food, int duration) {
		this.surname = surname;
		this.purpose = purpose;
		this.transport = transport;
		this.food = food;
		this.duration = duration;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
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
		return "Client [surname=" + surname + ", purpose=" + purpose + ", transport=" + transport + ", food=" + food
				+ ", duration=" + duration + "]";
	}
	
	

}

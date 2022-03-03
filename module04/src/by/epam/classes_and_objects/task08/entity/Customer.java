package by.epam.classes_and_objects.task08.entity;

public class Customer {

	private int id;
	private String lastName;
	private String address;
	private int creditCardNumber;
	private int bankAccountNumber;

	public Customer(int id, String lastName, String address, int creditCardNumber, int bankAccountNumber) {
		this.id = id;
		this.lastName = lastName;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", lastName=" + lastName + ", address=" + address + ", creditCardNumber="
				+ creditCardNumber + ", bankAccountNumber=" + bankAccountNumber + "]";
	}

}

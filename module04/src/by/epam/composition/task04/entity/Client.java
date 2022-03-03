package by.epam.composition.task04.entity;

import java.util.List;

public class Client {
	
	private String surname; // фамилия клиента
	List<BankAccount> accounts; // его счет(а)
	
	public Client(String surname, List<BankAccount> accounts) {
		this.surname = surname;
		this.accounts = accounts;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Client [surname=" + surname + ", accounts=" + accounts + "]";
	}
	
	

}

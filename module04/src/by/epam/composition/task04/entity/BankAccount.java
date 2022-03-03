package by.epam.composition.task04.entity;

import java.util.Random;

public class BankAccount {

	private static int counter = 1;
	private final int ID = counter++; // id счета
	private double balance;				// баланс
	private boolean isBlocked;		// отметка о блокировке счета

	public BankAccount(double balance) { // при создании счета, проверяется баланс и принимется решение о 
		this.balance = balance;			 // блокировке/разблокировке счета

		if (this.balance <= 0) {
			this.isBlocked = true;
		} else {
			this.isBlocked = false;
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public int getID() {
		return ID;
	}

	@Override
	public String toString() {
		return "BankAccount [ID=" + ID + ", balance=" + balance + ", isBlocked=" + isBlocked + "]";
	}

	// показать остаток по счету
	public void printBalance() {
		System.out.println("Текущий остаток счета " + this.getID() + " = " + this.getBalance());
	}

	// увеличить баланс и разблокируем счет
	public void increaseBalance() {	
		Random random = new Random();
		System.out.println("Попытка пополнения счета " + this.getID() + " ...");
		if(this.isBlocked) {
			this.setBalance(random.nextInt(50) + 51);
			this.isBlocked = false;
			System.out.println("\tСостояние счета после пополнеия = " + this.getBalance() + ", состояние блокировки: " + this.isBlocked);			
			return;
		}
		this.printBalance();
		System.out.println("\tПополнять нет необходимости.");
	}

}

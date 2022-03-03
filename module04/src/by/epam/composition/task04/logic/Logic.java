package by.epam.composition.task04.logic;

import java.util.List;

import by.epam.composition.task04.entity.BankAccount;
import by.epam.composition.task04.entity.Client;

public class Logic {

	// вывод счетов на экран
	public void print(Client client) {
		for (BankAccount bankAccount : client.getAccounts()) {
			System.out.println("\t" + bankAccount);
		}
	}

	// поиск счета по id
	public void findBankAccount(Client client, int id) {
		for (int i = 0; i < client.getAccounts().size(); i++) {
			if (client.getAccounts().get(i).getID() == id) {
				System.out.println("Счет клиента " + client.getSurname() + " c id = " + id + " найден: "
						+ client.getAccounts().get(i));
				return;
			}
		}
		System.out.println("Счета с id = " + id + " не существует.");
	}

	// поиск заблокированных счетов и их разблокировка
	public void getBlockedBankAccountsAndMakeThemUnblocked(Client client) {
		System.out.println("Список заблокированных счетов: ");
		for (int i = 0; i < client.getAccounts().size(); i++) {
			if (client.getAccounts().get(i).isBlocked() == true) {
				System.out.println("\t" + client.getAccounts().get(i));
				client.getAccounts().get(i).increaseBalance();
			}
		}

	}

	// сортировка счетов по возрастанию суммы
	public void sortBankAccount(Client client) {
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < client.getAccounts().size() - 1; i++) {
				if (client.getAccounts().get(i).getBalance() > client.getAccounts().get(i + 1).getBalance()) {
					isSorted = false;
					BankAccount temp = client.getAccounts().get(i);
					client.getAccounts().set(i, client.getAccounts().get(i + 1));
					client.getAccounts().set(i + 1, temp);
				}
			}
		}
	}
	
	// вспомагательный метод сложения всех счетов
	public double getAllSum(List<BankAccount> bA) {
		double sum = 0;
		for(BankAccount bankAccount : bA) {
			sum += bankAccount.getBalance();
		}
		return sum;
	}
	
	// общая сумма на счетах
	public double totalSum(Client client) {		
		return getAllSum(client.getAccounts());
	}
	
	// вспомагательный метод сложения всех счетов c положительным балансом
	public double getAllPositiveSum(List<BankAccount> bA) {
		double sum = 0;
		for(BankAccount bankAccount: bA) {
			if(bankAccount.getBalance() > 0) {
				sum += bankAccount.getBalance();
			}
		}
		return sum;
	}
		
	// общая сумма на счетах с положительным балансом
	public double totalSumAtPositiveBalanceBankAccount(Client client) {
		return getAllPositiveSum(client.getAccounts());
	}
	
	// вспомагательный метод сложения всех счетов c отрицательным балансом
		public double getAllNegativeSum(List<BankAccount> bA) {
			double sum = 0;
			for(BankAccount bankAccount: bA) {
				if(bankAccount.getBalance() <= 0) {
					sum += bankAccount.getBalance();
				}
			}
			return sum;
		}
	
		// общая сумма на счетах с положительным балансом
		public double totalSumAtNegativeBalanceBankAccount(Client client) {
			return getAllNegativeSum(client.getAccounts());
		}

}

package by.epam.composition.task04;

import java.util.ArrayList;
import java.util.List;

import by.epam.composition.task04.entity.BankAccount;
import by.epam.composition.task04.entity.Client;
import by.epam.composition.task04.logic.Logic;

public class Main {
	
	/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по 
всем счетам, имеющим положительный и отрицательный балансы отдельно. 
*/

	public static void main(String[] args) {
		Logic logic = new Logic();

		List<BankAccount> bankAccounts = new ArrayList<>();
		bankAccounts.add(new BankAccount(100));
		bankAccounts.add(new BankAccount(-50));
		bankAccounts.add(new BankAccount(0));
		bankAccounts.add(new BankAccount(13200));
		bankAccounts.add(new BankAccount(-10));
		
		Client client = new Client("Иванов", bankAccounts); // сам клиент
		
		System.out.println("Исходные счета клиента " + client.getSurname()+":");
		logic.print(client); // печать исходной информации о счетах 
		
		System.out.println("=========================================================================");
		
		logic.sortBankAccount(client); // сортировка по возрастанию баланса 
		System.out.println("Счета клиента " + client.getSurname()+" после сортировки:");
		logic.print(client); // вывод отсортированной информации
		
		System.out.println("=========================================================================");
		
		System.out.println("Поиск счета по id:");
		logic.findBankAccount(client, 9); // поиск счета по id
		
		System.out.println("=========================================================================");
		
		System.out.println("Общая сумма на счетах: " + logic.totalSum(client));		
		System.out.println("Общая сумма на счетах c положительным балансом: " + logic.totalSumAtPositiveBalanceBankAccount(client));
		System.out.println("Общая сумма на счетах c отрицательным балансом: " + logic.totalSumAtNegativeBalanceBankAccount(client));
		
		System.out.println("=========================================================================");
		
		logic.getBlockedBankAccountsAndMakeThemUnblocked(client); // пополняем заблокированные счета
		
		System.out.println("=========================================================================");
		
		System.out.println("Информация о счетах с учетом пополнения и разблокироки (true - заблокирован/false - нет):");
		logic.print(client);

		System.out.println("=========================================================================");
		
		
		
		
		
		
	}

}

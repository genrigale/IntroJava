package by.epam.oop.task04;

import java.util.List;

import by.epam.oop.task04.entity.Chest;
import by.epam.oop.task04.entity.DragonCave;
import by.epam.oop.task04.entity.Treasure;
import by.epam.oop.task04.helper.TreasureCreator;
import by.epam.oop.task04.logic.ChooseTreasure;
import by.epam.oop.task04.logic.ShowTreasure;

public class Main {
	/*
	 * 04. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в
	 * пещере дракона. Реализовать возможность просмотра сокровищ, выбора самого
	 * дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.
	 */
	public static void main(String[] args) {

		// создаем 100 сокровищ
		List<Treasure> dragonTreasures = TreasureCreator.getInstatnt().create();
		// помещаем их в сундук
		Chest dragonChest = new Chest("Сундук с сокровищами", dragonTreasures);
		// помещаем сундук в пещеру
		DragonCave dragonCave = new DragonCave(dragonChest);

		System.out.println(
				"=====================================================================================================");

		ShowTreasure.getInstant().printAll(dragonCave); // вывод всех сокровищ

		System.out.println(
				"=====================================================================================================");

		ShowTreasure.getInstant().printById(dragonCave, 4); // вывод по id

		System.out.println(
				"=====================================================================================================");

		List<Treasure> mostExpensiveTreasures = ChooseTreasure.getInstant().getMostExpensive(dragonCave);
		System.out.println("\tСамый дорогой экземпляр(ы):");
		ShowTreasure.getInstant().print(mostExpensiveTreasures); // самые дорогое экземпляры

		System.out.println(
				"=====================================================================================================");

		List<Treasure> treasuresBySpecificSum = ChooseTreasure.getInstant().getTreasureBySpecificSum(dragonCave, 200);
		System.out.println("\tСокровища на определенную сумму:");
		ShowTreasure.getInstant().print(treasuresBySpecificSum); // сокр-ща на опред-ю сумму

	}

}

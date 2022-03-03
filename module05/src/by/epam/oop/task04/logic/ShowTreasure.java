package by.epam.oop.task04.logic;

import java.util.List;

import by.epam.oop.task04.entity.DragonCave;
import by.epam.oop.task04.entity.Treasure;

public class ShowTreasure {

	private static final ShowTreasure INSTANT = new ShowTreasure();

	private ShowTreasure() {
	}

	public static ShowTreasure getInstant() {
		return INSTANT;
	}

	/*
	 * вывод списка List<Treasure>
	 */
	public void print(List<Treasure> list) {
		for (Treasure treasure : list) {
			System.out.println("\t\t" + treasure);
		}
	}

	/*
	 * показать все сокровища
	 */
	public void printAll(DragonCave dragonCave) {
		System.out.println("\tСодержимое сундука:");
		for (Treasure treasure : dragonCave.getChest().getTreasures()) {
			System.out.println("\t\t" + treasure);
		}

	}

	/*
	 * показать сокровища по id
	 */
	public void printById(DragonCave dragonCave, int id) {
		for (Treasure treasure : dragonCave.getChest().getTreasures()) {
			if (treasure.getId() == id) {
				System.out.println("\tСокровище с id = " + id + ": ");
				System.out.println("\t\t" + treasure);
				return;
			}
		}
		System.out.println("\tСокровище с id = " + id + " не найдено(");
	}

}

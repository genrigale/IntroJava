package by.epam.oop.task04.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.oop.task04.entity.DragonCave;
import by.epam.oop.task04.entity.Treasure;

public class ChooseTreasure {

	private static final ChooseTreasure INSTANT = new ChooseTreasure();

	private ChooseTreasure() {
	}

	public static ChooseTreasure getInstant() {
		return INSTANT;
	}

	/*
	 * выбрать самое дорогое сокровище
	 */
	public List<Treasure> getMostExpensive(DragonCave dragonCave) {

		List<Treasure> result = new ArrayList<>();

		int maxPrice = dragonCave.getChest().getTreasures().get(0).getPrice();

		for (Treasure treasure : dragonCave.getChest().getTreasures()) {
			if (treasure.getPrice() > maxPrice) {
				maxPrice = treasure.getPrice();
			}
		}

		for (Treasure treasure : dragonCave.getChest().getTreasures()) {
			if (treasure.getPrice() == maxPrice) {
				result.add(treasure);
			}
		}

		return result;
	}

	/*
	 * выбор сокровищ на заданную сумму
	 */
	public List<Treasure> getTreasureBySpecificSum(DragonCave dragonCave, int limit) {
		List<Treasure> result = new ArrayList<>();

		int sum = 0;

		for (Treasure treasure : dragonCave.getChest().getTreasures()) {
			sum += treasure.getPrice();

			if (sum <= limit) {
				result.add(treasure);
			} else {
				break;
			}
		}

		return result;

	}

}

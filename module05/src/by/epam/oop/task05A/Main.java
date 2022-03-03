package by.epam.oop.task05A;

import java.util.Map;

import by.epam.oop.task05A.bean.Bouquet;
import by.epam.oop.task05A.bean.Flower;
import by.epam.oop.task05A.bean.Pack;
import by.epam.oop.task05A.logic.FlowerShop;

public class Main {

	public static void main(String[] args) {
		FlowerShop flowerShop = new FlowerShop();

		Map<Flower, Integer> flowersMap = flowerShop.createMap(); // контейнер для цветов и количества

		flowerShop.chooseFlower(flowersMap, "TULIP", 5);/* выбираем цветы для букета */
		flowerShop.chooseFlower(flowersMap, "ROSE", 3);

		Pack pack = flowerShop.choosePack("PLASTIC"); // выбираем упаковку

		int totalPrice = flowerShop.countTotalPrice(flowersMap); // считаем общую стоимость заказа

		Bouquet bouquet = flowerShop.getBouquet(new Bouquet(), flowersMap, pack, totalPrice); // формиреум букет

		System.out.println(bouquet);

	}

}
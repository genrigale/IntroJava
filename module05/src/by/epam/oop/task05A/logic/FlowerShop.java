package by.epam.oop.task05A.logic;

import java.util.HashMap;
import java.util.Map;

import by.epam.oop.task05A.bean.Bouquet;
import by.epam.oop.task05A.bean.Flower;
import by.epam.oop.task05A.bean.Pack;

public class FlowerShop implements BouquetCreator {

	@Override
	public Map<Flower, Integer> createMap() {
		return new HashMap<>();
	}

	@Override
	public void chooseFlower(Map<Flower, Integer> flowersMap, String flowerName, int quantity) {
		Flower[] flowers = Flower.values();
		for (Flower flower : flowers) {
			if (flower.name().equals(flowerName) && (quantity > 0 && quantity <= flower.getQuantity())) {
				flowersMap.put(flower, quantity); // добавляем в корзину цветок в количестве quantity
				flower.setOrderedQuantity(quantity); // делаем отметку о заказанном количестве этого цветка
				flower.setQuantity(flower.getQuantity() - quantity); // уменьшаем количество заказанного цветка на то,
																		// которое заказали
			}
		}

	}

	@Override
	public int countTotalPrice(Map<Flower, Integer> flowersMap) {
		int sum = 0;
		int localSum = 0;
		for(Map.Entry<Flower, Integer> item: flowersMap.entrySet()) {
			localSum = item.getKey().getUnitPrice() * item.getValue();
			sum += localSum;
		}
		return sum;
	}

	@Override
	public Pack choosePack(String packName) {
		Pack[] packs = Pack.values();
		for (Pack pack : packs) {
			if (pack.name().equals(packName)) {
				return pack;
			}
		}
		return null;
	}

	@Override
	public Bouquet getBouquet(Bouquet bouquet, Map<Flower, Integer> flowersMap, Pack pack, int totalPrice) {
		bouquet.setFlowers(flowersMap);
		bouquet.setPack(pack);
		bouquet.setTotalPrice(totalPrice);		
		return bouquet;
	}

}

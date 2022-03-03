package by.epam.oop.task05A.logic;


import java.util.Map;

import by.epam.oop.task05A.bean.Bouquet;
import by.epam.oop.task05A.bean.Flower;
import by.epam.oop.task05A.bean.Pack;

public interface BouquetCreator {
	
	/*создаем контейнер для цветов и их количества*/
	Map<Flower, Integer> createMap();	
	
	/*подбор цветов и их количества*/
	void chooseFlower(Map<Flower, Integer> flowersMap, String flowerName, int quantity);
	
	/*выбор упаковки*/
	Pack choosePack(String packName);
	
	/*считаем общую стоимость букета*/
	int countTotalPrice(Map<Flower, Integer> flowersMap);
	
	/* создаем букет */
	Bouquet getBouquet(Bouquet bouquet, Map<Flower, Integer> flowersMap, Pack pack, int totalPrice);
	
	

}

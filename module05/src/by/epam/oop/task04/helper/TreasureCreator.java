package by.epam.oop.task04.helper;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import by.epam.oop.task04.entity.Treasure;

public class TreasureCreator {

	private static final TreasureCreator INSTATNT = new TreasureCreator();
	
	private TreasureCreator() {}
	
	public static TreasureCreator getInstatnt() {
		return INSTATNT;
	}
	
	
	/*
	 * создаем 100 сокровищ
	 * ценой от 10 до 39 ед.
	 * количеством от 1 до 10 шт. 
	 * */
	public List<Treasure> create(){
		List<Treasure> treasures = new ArrayList<>();		
		int treasureId = 1;
		Random random = new Random();		
				
		for(int i = 0; i < 100; i++) {
			Treasure treasure = new Treasure(treasureId, random.nextInt(30) + 10, random.nextInt(10) + 1);
			treasures.add(treasure);
			treasureId++;
		}
		
		return treasures;		
	}
	
	
	
	
	
	
	
	
}

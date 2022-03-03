package by.epam.composition.task03;

import java.util.ArrayList;
import java.util.List;

import by.epam.composition.task03.entity.Area;
import by.epam.composition.task03.entity.City;
import by.epam.composition.task03.entity.District;
import by.epam.composition.task03.entity.State;

public class Main {
	/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль 
столицу, количество областей, площадь, областные центры.*/

	public static void main(String[] args) {
		
		City city1 = new City("Белыничи");
		City city2 = new City("Бобруйск");
		City city3 = new City("Могилев");
		City city4 = new City("Кричев");
		City city5 = new City("Мстиславль");

		District district1 = new District("Белыничский район", city1);
		District district2 = new District("Бобруйский район", city2);
		District district3 = new District("Могилевский район", city3);
		District district4 = new District("Кричевский район", city4);
		District district5 = new District("Мстиславский район", city5);

		List<District> mogilevAreaDistricts = new ArrayList<>();
		mogilevAreaDistricts.add(district1);
		mogilevAreaDistricts.add(district2);
		mogilevAreaDistricts.add(district3);
		mogilevAreaDistricts.add(district4);
		mogilevAreaDistricts.add(district5);
		
		/*==================================================================================================================*/
		
		City city6 = new City("Браслав");
		City city7 = new City("Витебск");
		City city8 = new City("Орша");
		City city9 = new City("Полоцк");
		City city10 = new City("Лепель");
		
		District district6 = new District("Браславский район", city6);
		District district7 = new District("Витебский район", city7);
		District district8 = new District("Оршанский район", city8);
		District district9 = new District("Полоцкий район", city9);
		District district10 = new District("Лепельский район", city10);
		
		List<District> vitebskAreaDistricts = new ArrayList<>();
		vitebskAreaDistricts.add(district6);
		vitebskAreaDistricts.add(district7);
		vitebskAreaDistricts.add(district8);
		vitebskAreaDistricts.add(district9);
		vitebskAreaDistricts.add(district10);
		
		/*==================================================================================================================*/
		
		City city11 = new City("Барановичи");
		City city12 = new City("Брест");
		City city13 = new City("Кобрин");
		City city14 = new City("Лунинец");
		City city15 = new City("Пинск");
		
		District district11 = new District("Барановичский район", city11);
		District district12 = new District("Брестский район", city12);
		District district13 = new District("Кобринский район", city13);
		District district14 = new District("Лунинецкий район", city14);
		District district15 = new District("Пинский район", city15);
		
		List<District> brestAreaDistricts = new ArrayList<>();
		brestAreaDistricts.add(district11);
		brestAreaDistricts.add(district12);
		brestAreaDistricts.add(district13);
		brestAreaDistricts.add(district14);
		brestAreaDistricts.add(district15);
		
		/*==================================================================================================================*/
		
		City city16 = new City("Волковыск");
		City city17 = new City("Гродно");
		City city18 = new City("Лида");
		City city19 = new City("Мосты");
		City city20 = new City("Слоним");
		
		District district16 = new District("Волковысский район", city16);
		District district17 = new District("Гродненский район", city17);
		District district18 = new District("Лидский район", city18);
		District district19 = new District("Мостовский район", city19);
		District district20 = new District("Слонимский район", city20);
		
		List<District> grodnoAreaDistricts = new ArrayList<>();
		grodnoAreaDistricts.add(district16);
		grodnoAreaDistricts.add(district17);
		grodnoAreaDistricts.add(district18);
		grodnoAreaDistricts.add(district19);
		grodnoAreaDistricts.add(district20);
		
		/*==================================================================================================================*/
		
		City city21 = new City("Ветка");
		City city22 = new City("Гомель");
		City city23 = new City("Добруш");
		City city24 = new City("Ельск");
		City city25 = new City("Жлобин");
		
		District district21 = new District("Волковысский район", city21);
		District district22 = new District("Гродненский район", city22);
		District district23 = new District("Лидский район", city23);
		District district24 = new District("Мостовский район", city24);
		District district25 = new District("Слонимский район", city25);
		
		List<District> gomelAreaDistricts = new ArrayList<>();
		gomelAreaDistricts.add(district21);
		gomelAreaDistricts.add(district22);
		gomelAreaDistricts.add(district23);
		gomelAreaDistricts.add(district24);
		gomelAreaDistricts.add(district25);		
		
		/*==================================================================================================================*/
		
		City city26 = new City("Минск");
		City city27 = new City("Несвиж");
		City city28 = new City("Слуцк");
		City city29 = new City("Смолевичи");
		City city30 = new City("Борисов");
		
		District district26 = new District("Минский район", city26);
		District district27 = new District("Несвижский район", city27);
		District district28 = new District("Слуцкий район", city28);
		District district29 = new District("Смолевичский район", city29);
		District district30 = new District("Борисовский район", city30);
		
		List<District> minskAreaDistricts = new ArrayList<>();
		minskAreaDistricts.add(district26);
		minskAreaDistricts.add(district27);
		minskAreaDistricts.add(district28);
		minskAreaDistricts.add(district29);
		minskAreaDistricts.add(district30);
		
		/*==================================================================================================================*/		
		
		Area mogilevArea = new Area("Могилевская область", "Могилев", mogilevAreaDistricts);
		Area vitebskArea = new Area("Витебская область", "Витебск", vitebskAreaDistricts);
		Area brestArea = new Area("Бресткая область", "Брест", brestAreaDistricts);
		Area grondoArea = new Area("Гродненская область", "Гродно", grodnoAreaDistricts);
		Area gomelArea = new Area("Гомельская область", "Гомель", gomelAreaDistricts);
		Area minskArea = new Area("Минская область", "Минск", minskAreaDistricts);
		
		List<Area> areasOfBelarus = new ArrayList<>();
		areasOfBelarus.add(mogilevArea);
		areasOfBelarus.add(vitebskArea);
		areasOfBelarus.add(brestArea);
		areasOfBelarus.add(grondoArea);
		areasOfBelarus.add(gomelArea);
		areasOfBelarus.add(minskArea);		
		
		State state = new State("Республика Беларусь", "Минск", areasOfBelarus, 207600);
		
		/*==================================================================================================================*/	
		
		System.out.println("Государтво: " + state.getStateName());
		System.out.println("Столица: " + state.getCapital());
		System.out.println("Количество областей: " + state.getAreas().size());
		System.out.println("Площадь: " + state.getTheAreaOfTheState() + " км.кв.");
		
		System.out.println("Областные центры:");
		for(int i = 0; i < state.getAreas().size(); i++) {
			System.out.println("\t" + state.getAreas().get(i).getRegionalCenter());
		}		

	}

}

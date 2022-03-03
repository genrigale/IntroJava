package by.epam.string_and_stringbuilder;

import java.util.ArrayList;
import java.util.List;

public class Task08 {
//	08. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых 
//	длинных слов может быть несколько, не обрабатывать. 


	public static void main(String[] args) {
		String src = "Алабама1 что где когда Алабама2";
		String[] strArray = src.split(" "); // извлекаем только слова
		
		List<String> wordsWithMaxLength = new ArrayList<>(); 
		
		int maxLen = 0;
		for(int i = 0; i < strArray.length; i++) { // поиск слов с макс длиной
			if(strArray[i].length() >= maxLen) {
				maxLen = strArray[i].length();
				wordsWithMaxLength.add(strArray[i]); // сохраняем их в лист	
			}
		}
		
		System.out.println(wordsWithMaxLength.get(0)); // выводим любое
		
		

	}

}

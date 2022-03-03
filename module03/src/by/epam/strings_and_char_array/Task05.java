package by.epam.strings_and_char_array;

public class Task05 {
//	05.  Удалить в  строке  все  лишние  пробелы,  то  есть  серии  подряд  
//	идущих  пробелов  заменить на  одиночные  пробелы. 
//	Крайние пробелы в строке удалить. 

	public static void main(String[] args) {
		String string = " Шутки   за 300, шутки  за 400. ";
		System.out.println(string);
		String str = string.trim();
		System.out.println(str);
		
		String result = str.replaceAll(" {2,}", " ");
		
		System.out.println(result);

	}

}

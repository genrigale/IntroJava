package by.epam.strings_and_char_array;

import java.util.Arrays;

public class Task01 {
//	01. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case. 


	public static void main(String[] args) {
		String[] camelCaseNames = {"helloWorld", "snakeEater", "bobMarley"};
		StringBuilder[] snakeStyleNames = getSnakeStyleNames(camelCaseNames);
		System.out.println(Arrays.toString(camelCaseNames));
		System.out.println(Arrays.toString(snakeStyleNames));
		
	}
	
	
	public static StringBuilder toSnakeStyle(String str) {
		StringBuilder sb = new StringBuilder();
		char[] arr = str.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			if(Character.isLowerCase(arr[i])) {
				sb.append(arr[i]);
			}else {
				sb.append('_');
				sb.append(Character.toLowerCase(arr[i]));
			}
		}
		 return sb;		
	}
	
	public static StringBuilder[] getSnakeStyleNames(String[] strings) {
		StringBuilder[] result = new StringBuilder[strings.length];
		
		for(int i = 0; i < strings.length; i++) {
			StringBuilder item = toSnakeStyle(strings[i]);
			result[i] = item;
		}
		return result;
	}

}

package by.epam.string_and_stringbuilder;

public class Task04 {
//	04. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
	public static void main(String[] args) {
		String cake = "торт";
		String inform = "информатика";
		StringBuilder result = new StringBuilder();
		
		char[] cakeArray = cake.toCharArray();
		char[] informArray = inform.toCharArray();
			
			for(int i = 0; i < cakeArray.length; i++) {
				for(int j = 0; j < informArray.length; j++) {
					if(cakeArray[i] == informArray[j]) {
						result.append(informArray[j]);
						break;
					}
				}
			}
		
		System.out.println(result);

	}

}

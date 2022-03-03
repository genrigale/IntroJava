package by.epam.regex;

public class Task01 {
//	1.  Cоздать  приложение,  разбирающее  текст  (текст  хранится  в  строке)  и  позволяющее  выполнять  с  текстом  три  различных 
//	операции:  отсортировать  абзацы  по  количеству  предложений;  в  каждом  предложении  отсортировать  слова  по  длине; 
//	отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по 
//	алфавиту.
	
	public static void main(String[] args) {
		String str = "Здесь могла быть ваша реклама. Идейные соображения высшего порядка.\n" 
				   + "Таким образом. Дальнейшее развитие различных форм. Влечет за собой процесс внедрения.\n"
				   + "Бинарный опцион.";
		
		char ch = 'о';
		
		System.out.println("Исходный текст:\n");
		System.out.println(str);
		System.out.println("======================================================================================================");		
		System.out.println("Абзацы по количеству предложений:\n");
		sortParagrahsBySentencesCount(str);
		System.out.println("======================================================================================================");
		System.out.println("Слова предложений от меньшего к большему:\n");
		sortWordsInEverySentence(str);
		System.out.println("======================================================================================================");
		System.out.println("Сортировка слов по убыванию количества вхождений символа: " + ch + "\n");
		sortBySymbolAppears(str, ch);
	}
	
	
	// сортировка 
	public static void sort(String[] array) {
		boolean sorted = false;
		String temp = "";
		
		while(!sorted) {
			sorted = true;
			for(int i = 0; i < array.length - 1; i++) {
				if(array[i].length() > array[i + 1].length()) {
					sorted = false;
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
		printResult(array);
	}
	
	// вывод на экран
	public static void printResult(String[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i].trim());
		}	
	}	
	
	// сортировка абзацев по количеству предложений
	public static void sortParagrahsBySentencesCount(String input) {
		String[] paragrahs = input.split("\n");		
		sort(paragrahs);
	}
	
	// разбивка предложения на слова
	public static String[] getWords(String str) {
		return str.split("\\p{P}?[ \\t\\n\\r]+");
	}		
	
	// сортировка слов в предложениях
	public static void sortWordsInEverySentence(String input) {
		for(String str : input.split("[!?.]")) {
			str.trim();
			sort(getWords(str));
		}
	}
	
	// подсчет количества вхождений символа в слове
	public static int countSymbol(String word, char symbol) {
		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == symbol) {
				count++;
			}
		}
		return count;
	}
	
	// сортировка слов по вхождению символа (убывание)
	public static void sortBySymbolAppears(String str, char symbol) {
		String[] words = str.split("\\p{P}?[ \\t\\n\\r.]+");

		for (int i = 0; i < words.length - 1; i++) {
			for (int j = i + 1; j < words.length; j++) {
				int symb1 = countSymbol(words[i], symbol);
				int symb2 = countSymbol(words[j], symbol);
				if (symb1 < symb2) {
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		printResult(words);	
	}
	
	
	
	
	

}

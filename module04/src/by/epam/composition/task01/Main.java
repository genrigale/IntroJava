package by.epam.composition.task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.epam.composition.task01.entity.Sentence;
import by.epam.composition.task01.entity.Text;
import by.epam.composition.task01.entity.Word;
import by.epam.composition.task01.logic.Logic;

public class Main {
	/*1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на 
консоль текст, заголовок текста.*/

	public static void main(String[] args) {
		/* ================================================================== */
		List<Word> sent1 = new ArrayList<>();
		sent1.add(new Word("Вчера"));
		sent1.add(new Word("был"));
		sent1.add(new Word("замечательный"));
		sent1.add(new Word("день."));
		
		List<Word> sent2 = new ArrayList<>();
		sent2.add(new Word("Надеюсь"));
		sent2.add(new Word("такая"));
		sent2.add(new Word("погода"));
		sent2.add(new Word("сохранится"));
		sent2.add(new Word("надолго."));

		Sentence sentence1 = new Sentence(sent1); // 1е предложение
		Sentence sentence2 = new Sentence(sent2); // 2е предложение

		List<Sentence> sentences = new ArrayList<>();
		sentences.add(sentence1);
		sentences.add(sentence2);

		List<Word> headerForText = new ArrayList<>();
		headerForText.add(new Word("Воспоминания..."));

		Sentence textHeader = new Sentence(headerForText);
		
		/* сделали текст, состоящий из двух предложений и заголовка */
		Text text = new Text(sentences); // текст
		text.setHeader(textHeader); // заголовок

		/* ================================================================== */

		System.out.println(text.getHeader()); // выводим заголовок

		Logic logic = new Logic();

		logic.print(text); // выводим исходный текст
		
		logic.addNewSentence(text, new Sentence(Arrays.asList(new Word("Очень"), new Word("надолго.")))); // добавили новое предложение	
		
		System.out.println();
		
		logic.print(text); // выводим исходный текст после добаваления предложения
	}

}

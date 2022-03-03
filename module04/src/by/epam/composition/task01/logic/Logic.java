package by.epam.composition.task01.logic;

import by.epam.composition.task01.entity.Sentence;
import by.epam.composition.task01.entity.Text;

public class Logic {

	public void print(Text text) {
		for (int i = 0; i < text.getSentences().size(); i++) {
			for (int j = 0; j < text.getSentences().get(i).getWords().size(); j++) {
				System.out.print(text.getSentences().get(i).getWords().get(j) + " ");
			}
		}
	}
	
	
	public void addNewSentence(Text text, Sentence sentence) {
		text.getSentences().add(sentence);
	}
	
}
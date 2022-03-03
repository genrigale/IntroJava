package by.epam.composition.task01.entity;

import java.util.List;

public class Sentence {

	private List<Word> words;

	public Sentence(List<Word> words) {
		this.words = words;
	}

	public List<Word> getWords() {
		return words;
	}

	public void setWords(List<Word> words) {
		this.words = words;
	}

	@Override
	public String toString() {
		return words.toString();
	}
	
	

	
	
	
	
}

package by.epam.composition.task01.entity;

public class Word {
	
	private String theWord;

	public Word(String theWord) {
		this.theWord = theWord;
	}

	public String getWord() {
		return theWord;
	}

	public void setWord(String theWord) {
		this.theWord = theWord;
	}

	@Override
	public String toString() {
		return theWord;
	}
	
	
	

}

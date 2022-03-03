package by.epam.composition.task01.entity;

import java.util.List;

public class Text {

	private List<Sentence> sentences;
	private Sentence header;

	public Text(List<Sentence> sentences) {
		this.sentences = sentences;		
	}

	public List<Sentence> getSentences() {
		return sentences;
	}

	public void setSentences(List<Sentence> sentences) {
		this.sentences = sentences;
	}

	public Sentence getHeader() {
		return header;
	}

	public void setHeader(Sentence header) {
		this.header = header;
	}

	@Override
	public String toString() {
		return "Text [sentences=" + sentences + "]";
	}
	
	
}

package by.epam.oop.task01.entity;

public class TextFile extends File {

	private String content;

	public TextFile(String nameFile, String extension) {
		super(nameFile, extension);
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public void createFile(String text) {		/*создание файла*/
		this.setContent(text);
	}

	@Override
	public void renameFile(String newName) {		/*переименование файла*/
		this.setNameFile(newName);

	}

	@Override
	public String showInputContent() {
		return "Содержимое файла " + this.getNameFile() + " -> " + this.getContent();		/*показать содержимое*/
	}

	@Override
	public void addFileContent(String newContent) {		/*дополнить файл*/
		String content = this.getContent();
		content += newContent;
		this.setContent(content);
	}

	
	@Override
	public String toString() {
		return "TextFile [ content=" + content + "]";
	}

}

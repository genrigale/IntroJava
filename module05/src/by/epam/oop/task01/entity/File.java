package by.epam.oop.task01.entity;

public abstract class File {

	private String nameFile;
	private String extension;
	
	public File(String nameFile, String extension) {
		this.nameFile = nameFile;
		this.extension = extension;
	}

	
	public String getNameFile() {
		return nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public abstract void createFile(String Text);

	public abstract void renameFile(String newName);

	public abstract String showInputContent();

	public abstract void addFileContent(String newContent);

	@Override
	public String toString() {
		return "File [nameFile=" + nameFile + ", extension=" + extension + "]";
	}

}

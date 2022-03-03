package by.epam.oop.task01.entity;

import java.util.List;

public class Directory {

	private String nameDirectory;
	private List<File> files;

	public Directory(String nameDirectory, List<File> files) {
		this.nameDirectory = nameDirectory;
		this.files = files;
	}

	public String getNameDirectory() {
		return nameDirectory;
	}

	public void setNameDirectory(String nameDirectory) {
		this.nameDirectory = nameDirectory;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	
	/*поиск  файла по имени*/	
	public File findFileByName(String fileName) {
		for(int i = 0; i < this.getFiles().size(); i++) {
			if(this.getFiles().get(i).getNameFile().equals(fileName)) {
				return this.getFiles().get(i);
			}
		}
		return null;
	}
	
	
	/*удаление файла*/
	public void removeFile(String fileName) {
		File fileToRemove = findFileByName(fileName);
		this.getFiles().remove(fileToRemove);
	}
	
	/*вывод списка файлов с расширениями*/
	public void printFilesList() {
		for(int i = 0; i < this.getFiles().size(); i++) {
			System.out.println("\t" + this.getFiles().get(i).getNameFile() + " " +  this.getFiles().get(i).getExtension());
		}
	}
	
	/*вывод содержимого файлов*/
	public void printFilesContent() {
		for(int i = 0; i < this.getFiles().size(); i++) {
			System.out.println("\t" + this.getFiles().get(i).showInputContent());
		}
	}

	@Override
	public String toString() {
		return "Directory [nameDirectory=" + nameDirectory + ", files=" + files + "]";
	}

}

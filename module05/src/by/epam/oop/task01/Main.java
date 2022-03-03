package by.epam.oop.task01;

import java.util.ArrayList;
import java.util.List;

import by.epam.oop.task01.entity.Directory;
import by.epam.oop.task01.entity.File;
import by.epam.oop.task01.entity.TextFile;

public class Main {

	/*
	 * 01. Создать объект класса Текстовый файл, используя классы Файл, Директория.
	 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить,
	 * удалить.
	 */

	public static void main(String[] args) {

		// ========================================================================

		/*создаем текстовые файлы, помещаем их в список и создаем каталог файлов*/

		TextFile textFile1 = new TextFile("file1", "txt");
		textFile1.createFile("Hello, World!");

		TextFile textFile2 = new TextFile("file2", "txt");
		textFile2.createFile("Little mouse, where is your house?");

		List<File> files = new ArrayList<>();
		files.add(textFile1);
		files.add(textFile2);

		Directory directory = new Directory("new folder", files);

		// ========================================================================

		/* выводим на печать исходные файлы */

		System.out.println("Имена файлов в каталоге и их расширения:");
		directory.printFilesList();

		System.out.println("========================================================================================");

		/* переименовываем файлы и выводим на экран */

		File fileToRename1 = directory.findFileByName("file1");
		fileToRename1.renameFile("newFile666");

		File fileToRename2 = directory.findFileByName("file2");
		fileToRename2.renameFile("hello333");

		System.out.println("Имена файлов в каталоге после переименования:");
		directory.printFilesList();

		System.out.println("========================================================================================");

		// ========================================================================

		/* выводим содержимое файлов */

		System.out.println("Содержимое файлов:");
		directory.printFilesContent();

		System.out.println("========================================================================================");

		// ========================================================================

		/* допполняем исходные файлы */

		File fileToAddContent1 = directory.findFileByName("newFile666");
		fileToAddContent1.addFileContent(" How you doing?");

		File fileToAddContent2 = directory.findFileByName("hello333");
		fileToAddContent2.addFileContent(" London is the capital of Great Britain.");

		System.out.println("Содержимое файлов после дополнения:");
		directory.printFilesContent();

		System.out.println("========================================================================================");

		// ========================================================================

		/* удаляем файл */

		System.out.println("Удаляем файл с именем newFile666.");
		directory.removeFile("newFile666");

		System.out.println("Список файлов в каталоге после удаления:");
		directory.printFilesList();

		System.out.println("========================================================================================");

		// ========================================================================

	}

}

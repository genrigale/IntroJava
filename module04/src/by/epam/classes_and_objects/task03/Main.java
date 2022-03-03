package by.epam.classes_and_objects.task03;

import java.util.ArrayList;
import java.util.List;

/*3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив 
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и 
номеров групп студентов, имеющих оценки, равные только 9 или 10. */

public class Main {

	public static void main(String[] args) {
		Student[] students = new Student[] { 
				new Student("Ivanov", 1, new int[] { 5, 6, 7, 8, 9 }),
				new Student("Petrov", 2, new int[] { 4, 5, 7, 10, 8 }),                 
				new Student("Sidorov", 4, new int[] { 10, 10, 10, 10, 10 }),
				new Student("Lavrov", 1, new int[] { 3, 5, 6, 7, 8 }),
				new Student("Lomonosov", 3, new int[] { 9, 9, 9, 9, 9 }),			/*Создаем массив из десяти студентов*/
				new Student("Lobanov", 5, new int[] { 3, 3, 3, 3, 3 }),						
				new Student("Levin", 2, new int[] { 8, 8, 8, 8, 8 }),
				new Student("Kupitman", 1, new int[] { 10, 10, 10, 10, 10 }),
				new Student("Kozlovskiy", 3, new int[] { 5, 5, 5, 5, 5 }),
				new Student("Dvinyatin", 5, new int[] { 7, 8, 7, 8, 7 }) };

		System.out.println("Исходные студенты:");
		for (Student student : students) {
			System.out.println("\t" + student);
		}
		
		//=============================================================================================
		List<Student> bestStudents = new ArrayList<>();
		
		for(Student st : students) {
			int length = st.getSuccess().length;
			int countNines = 0;
			int countTens = 0;
			
					for(int i = 0; i < st.getSuccess().length; i++) {
						if(st.getSuccess()[i] == 9) {
							countNines++;
						}												/*Находим студентов, у которых только 9-ки или 10-ки */		
						if(st.getSuccess()[i] == 10) {
							countTens++;
						}
					}
			
			if(countNines == length) {
				bestStudents.add(st);
			}
			
			if(countTens == length) {
				bestStudents.add(st);
			}
			
		}		
		//=============================================================================================

		System.out.println("Студенты с девятками и десятками:");
		for(Student st : bestStudents) {
			System.out.println("\tСтудент " + st.getLastName() + ", группа " + st.getGroupNumber() + ".");
		}
		
		

	}

}

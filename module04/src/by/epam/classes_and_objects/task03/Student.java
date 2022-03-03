package by.epam.classes_and_objects.task03;

import java.util.Arrays;

class Student {

	private String lastName;
	private int groupNumber;
	private int[] success;	
	
	public Student(String lastName, int groupNumber, int[] success) {
		super();
		this.lastName = lastName;
		this.groupNumber = groupNumber;
		this.success = success;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getGroupNumber() {
		return groupNumber;
	}
	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}
	public int[] getSuccess() {
		return success;
	}
	public void setSuccess(int[] success) {
		this.success = success;
	}

	@Override
	public String toString() {
		return "Student [lastName=" + lastName + ", groupNumber=" + groupNumber + ", success="
				+ Arrays.toString(success) + "]";
	}
	
	
	
	
	

}

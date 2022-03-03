package by.epam.classes_and_objects.task09.entity;

public class Author {
	
	private String lastName;
	
	

	public Author(String lastName) {
		super();
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "[" + lastName + "]";
	}
	
	

}

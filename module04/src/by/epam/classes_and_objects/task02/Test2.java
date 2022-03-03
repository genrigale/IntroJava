package by.epam.classes_and_objects.task02;



class Test2 {
	private String name;
	private int age;
	
	public Test2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Test2() {
		this.name = "Ivan";
		this.age = 18;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Test2 [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}

package by.epam.classes_and_objects.task01;



class Test1 {
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "Test1 [a=" + a + ", b=" + b + "]";
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int max (int a, int b) {
		if(a>b) {
			return a;
		}
		return b;
	}
	
	
	


	
	
	
	

	

}

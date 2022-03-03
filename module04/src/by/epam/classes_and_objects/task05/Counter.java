package by.epam.classes_and_objects.task05;

public class Counter {
	 static final int MAX_VAL = 10;
	 static final int MIN_VAL = 0;	
	
	private int curVal;	
	
	public int getCurVal() {
		return curVal;
	}

	public void setCurVal(int curVal) {
		this.curVal = curVal;
	}

	// инициальзация по-умолчанию
	public Counter() {
		this.curVal = 0;
	}
	
	// инициализация заданным значением
	public Counter(int curVal) {
		this.curVal = curVal;
	}

	@Override
	public String toString() {
		return "Counter [curVal=" + curVal + "]";
	}

	
	
	

}

package by.epam.classes_and_objects.task05;

public class Logic {
	
	public int increaseCounterValue(Counter counter) {
		// если текущее значение >= минимальному порогу и < максимальнго -> увеличиваем его на 1
		if(counter.getCurVal() >= Counter.MIN_VAL && counter.getCurVal() < Counter.MAX_VAL) {			
			counter.setCurVal(counter.getCurVal() + 1);	
			return  counter.getCurVal();			
		}
		// если текущее значение не попадает в обозначенный диапазон -> возвращаем то, что есть
		return counter.getCurVal();
	}
	
	public int decreaseCounterValue(Counter counter) {		
		// если текущее значение <= макс. порогу и > мин. порога -> уменьшаем его на 1
		if(counter.getCurVal() <= Counter.MAX_VAL && counter.getCurVal() > Counter.MIN_VAL) {
			counter.setCurVal(counter.getCurVal() - 1);
			return counter.getCurVal();
		}
		// если текущее значение не попадает в обозначенный диапазон -> возвращаем то, что есть
		return counter.getCurVal();
	}
	
	// показываем текущее значение счетчикаы
	public int getInfo(Counter counter) {
		return counter.getCurVal();
	}
	
	
	
}

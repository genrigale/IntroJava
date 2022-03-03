package by.epam.classes_and_objects.task06;

public class Logic {

	// увеличиваем time1, прибавляя к нему time2 
	public Time increaseTime(Time time1, Time time2) {
		int hours = time1.getHours() + time2.getHours();
		int minutes = time1.getMinutes() + time2.getMinutes();
		int seconds = time1.getSeconds() + time2.getSeconds();		
		
		if (seconds > 59) {
			minutes += 1;
			seconds -= 60;
		}

		if (minutes > 59) {
			hours += 1;
			minutes -= 60;
		}

		if (hours > 23) {
			hours -= 24;
		}

		return new Time(hours, minutes, seconds);
	}
	
	// уменьшаем time1 на time2
	public Time decreaseTime(Time time1, Time time2) {
		int hours = time1.getHours() - time2.getHours();
		int minutes = time1.getMinutes() - time2.getMinutes();
		int seconds = time1.getSeconds() - time2.getSeconds();
		
		if(seconds < 0) {
			minutes -= 1;
			seconds += 60;
		}
		
		if(minutes < 0) {
			hours -= 1;
			minutes += 60;
		}
		
		if(hours < 0) {
			hours += 24;
		}
		
		return new Time(hours, minutes, seconds);
	}
	
	

}

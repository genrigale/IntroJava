package by.epam.classes_and_objects.task06;

public class Time {

	private int hours;
	private int minutes;
	private int seconds;
	
	private static final int MIN_HOURS = 0;
	private static final int MAX_HOURS = 23;
	
	private static final int MIN_MINUTES = 0;
	private static final int MAX_MINUTES = 59;
	
	private static final int MIN_SECONDS = 0;
	private static final int MAX_SECONDS = 59;	
	
	
	public Time(int hours, int minutes, int seconds) {
		
		if(hours < MIN_HOURS || hours > MAX_HOURS) {
			this.hours = 0;
		}else {
			this.hours = hours;
		}
				
		if(minutes < MIN_MINUTES || minutes > MAX_MINUTES) {
			this.minutes = 0;
		}else {
			this.minutes = minutes;
		}
				
		if(seconds < MIN_SECONDS || seconds > MAX_SECONDS) {
			this.seconds = 0;
		}else {
			this.seconds = seconds;
		}
		
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if(hours < MIN_HOURS || hours > MAX_HOURS) {
			this.hours = 0;
		}else {
			this.hours = hours;
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if(minutes < MIN_MINUTES || minutes > MAX_MINUTES) {
			this.minutes = 0;
		}else {
			this.minutes = minutes;
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if(seconds < MIN_SECONDS || seconds > MAX_SECONDS) {
			this.seconds = 0;
		}else {
			this.seconds = seconds;
		}
	}

	@Override
	public String toString() {
		return this.hours + ":" + this.minutes + ":" + this.seconds;
	}

}

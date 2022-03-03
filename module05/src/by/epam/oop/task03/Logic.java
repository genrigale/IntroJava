package by.epam.oop.task03;

public class Logic {

	/* заполняем наш месяц днями (присваивая конкретному дню число и день недели) */
	public void fillMonthList(Calendar.Month month) {
		for (int i = 0; i < 31; i++) {
			Calendar.Day day = new Calendar().new Day(i + 1, DayOfWeek.values()[i % 7]);
			month.getDays().add(day);
		}
	}

	/* определяем праздничные дни (пусть это будет месяц МАРТ) */
	public void setupHolidays(Calendar.Month month) {
		int holidayDate = 8; // 8 марта

		for (Calendar.Day day : month.getDays()) {
			if (day.getNumberOfMonth() == holidayDate) {
				day.setHoliday(true);
				day.setWeekend(true);
			}
		}
	}
	
	/* определяем выходные дни (пусть это будет месяц МАРТ) */
	public void setupWeekends(Calendar.Month month) {		
		DayOfWeek saturday = DayOfWeek.SATURDAY;
		DayOfWeek sunday = DayOfWeek.SUNDAY;
		
		for (Calendar.Day day : month.getDays()) {
			if (day.getDayOfWeek().equals(sunday)) {
				day.setWeekend(true);
			}
			if (day.getDayOfWeek().equals(saturday)) {
				day.setWeekend(true);
			}			
		}
	}
	
	
	

}

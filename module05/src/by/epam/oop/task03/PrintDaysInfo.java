package by.epam.oop.task03;

public class PrintDaysInfo {
	
	
	/*вывод всех дней месяца*/
	public void printAllDaysOfMonth(Calendar calendar, String nameOfMonth) {		
		for(Calendar.Month month : calendar.getMonths()) {
			if(month.getName().equals(nameOfMonth)) {
				for(Calendar.Day day : month.getDays()) {
					System.out.println("\t" + day);
				}
			}			
		}
	}
	
	/*выводим выходные дни*/
	public void printWeekendOfMonth(Calendar calendar, String nameOfMonth) {
		for(Calendar.Month month : calendar.getMonths()) {
			if(month.getName().equals(nameOfMonth)) {
				for(Calendar.Day day : month.getDays()) {
					if(day.isWeekend() == true) {
						System.out.println("\t" + day);
					}					
				}
			}			
		}
	}	
	
	/*выводим праздничные дни*/
	public void printHolidayOfMonth(Calendar calendar, String nameOfMonth) {
		for(Calendar.Month month : calendar.getMonths()) {
			if(month.getName().equals(nameOfMonth)) {
				for(Calendar.Day day : month.getDays()) {
					if(day.isHoliday() == true) {
						System.out.println("\t" + day);
					}					
				}
			}			
		}
	}	
	
	

}

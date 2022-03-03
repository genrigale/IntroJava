package by.epam.oop.task03;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
	
	private int year;
	private List<Month> months;
	
	public Calendar() {
		
	}
		
	public Calendar(int year, List<Month> months) {
		this.year = year;
		this.months = months;
	}

	public int getYear() {
			return year;
		}


		public void setYear(int year) {
			this.year = year;
		}


		public List<Month> getMonths() {
			return months;
		}


		public void setMonths(List<Month> months) {
			this.months = months;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((months == null) ? 0 : months.hashCode());
			result = prime * result + year;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Calendar other = (Calendar) obj;
			if (months == null) {
				if (other.months != null)
					return false;
			} else if (!months.equals(other.months))
				return false;
			if (year != other.year)
				return false;
			return true;
		}
		
	@Override
		public String toString() {
			return "Calendar [year=" + year + ", months=" + months + "]";
		}

							/*ВНУТРЕННИЙ КЛАСС*/
							class Month{
								private String name;
								private List<Day> days;
								
								public Month(String name) {
									this.name = name;
									this.days = new ArrayList<>();
								}
						
								public String getName() {
									return name;
								}
						
								public void setName(String name) {
									this.name = name;
								}
						
								public List<Day> getDays() {
									return days;
								}
						
								public void setDays(List<Day> days) {
									this.days = days;
								}
						
								@Override
								public int hashCode() {
									final int prime = 31;
									int result = 1;
									result = prime * result + getEnclosingInstance().hashCode();
									result = prime * result + ((days == null) ? 0 : days.hashCode());
									result = prime * result + ((name == null) ? 0 : name.hashCode());
									return result;
								}
						
								@Override
								public boolean equals(Object obj) {
									if (this == obj)
										return true;
									if (obj == null)
										return false;
									if (getClass() != obj.getClass())
										return false;
									Month other = (Month) obj;
									if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
										return false;
									if (days == null) {
										if (other.days != null)
											return false;
									} else if (!days.equals(other.days))
										return false;
									if (name == null) {
										if (other.name != null)
											return false;
									} else if (!name.equals(other.name))
										return false;
									return true;
								}
						
								private Calendar getEnclosingInstance() {
									return Calendar.this;
								}
						
								@Override
								public String toString() {
									return "Month [name=" + name + ", days=" + days + "]";
								}
							}
							
							
							/*ВНУТРЕННИЙ КЛАСС*/
							class Day{
								private int numberOfMonth;
								private DayOfWeek dayOfWeek;
								private boolean isWeekend;
								private boolean isHoliday;
								
								public Day(int numberOfMonth, DayOfWeek dayOfWeek) {
									this.numberOfMonth = numberOfMonth;
									this.dayOfWeek = dayOfWeek;
								}								
						
								public int getNumberOfMonth() {
									return numberOfMonth;
								}
						
								public void setNumberOfMonth(int numberOfMonth) {
									this.numberOfMonth = numberOfMonth;
								}
						
								public DayOfWeek getDayOfWeek() {
									return dayOfWeek;
								}
						
								public void setDayOfWeek(DayOfWeek dayOfWeek) {
									this.dayOfWeek = dayOfWeek;
								}
						
								public boolean isWeekend() {
									return isWeekend;
								}
						
								public void setWeekend(boolean isWeekend) {
									this.isWeekend = isWeekend;
								}
						
								public boolean isHoliday() {
									return isHoliday;
								}
						
								public void setHoliday(boolean isHoliday) {
									this.isHoliday = isHoliday;
								}
						
								@Override
								public int hashCode() {
									final int prime = 31;
									int result = 1;
									result = prime * result + getEnclosingInstance().hashCode();
									result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
									result = prime * result + (isHoliday ? 1231 : 1237);
									result = prime * result + (isWeekend ? 1231 : 1237);
									result = prime * result + numberOfMonth;
									return result;
								}
						
								@Override
								public boolean equals(Object obj) {
									if (this == obj)
										return true;
									if (obj == null)
										return false;
									if (getClass() != obj.getClass())
										return false;
									Day other = (Day) obj;
									if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
										return false;
									if (dayOfWeek != other.dayOfWeek)
										return false;
									if (isHoliday != other.isHoliday)
										return false;
									if (isWeekend != other.isWeekend)
										return false;
									if (numberOfMonth != other.numberOfMonth)
										return false;
									return true;
								}
						
								@Override
								public String toString() {
									return "Day [numberOfMonth=" + numberOfMonth + ", dayOfWeek=" + dayOfWeek + ", isWeekend=" + isWeekend
											+ ", isHoliday=" + isHoliday + "]";
								}
						
								private Calendar getEnclosingInstance() {
									return Calendar.this;
								}
							}

}

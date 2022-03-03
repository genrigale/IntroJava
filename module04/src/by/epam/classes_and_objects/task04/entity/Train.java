package by.epam.classes_and_objects.task04.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Train {

	private String destName; /*пункт назначения*/
	private int trainNumber; /*номер поезда*/
	private Date departureTime; /*время отправления*/

	private static SimpleDateFormat stringToDate = new SimpleDateFormat("HH:mm"); /*шаблон перевода строки в тип Date*/

	public Train(String destName, int trainNumber, Date departureTime) {
		this.destName = destName;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}

	public String getDestName() {
		return destName;
	}

	public void setDestName(String destName) {
		this.destName = destName;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public static SimpleDateFormat getStringToDate() {
		return stringToDate;
	}

	public static void setStringToDate(SimpleDateFormat stringToDate) {
		Train.stringToDate = stringToDate;
	}

	@Override
	public String toString() {
		return "Train [destName=" + destName + ", trainNumber=" + trainNumber + ", departureTime="
				+ stringToDate.format(departureTime) + "]";
	}

	

	
	

	
}

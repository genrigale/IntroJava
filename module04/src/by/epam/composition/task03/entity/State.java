package by.epam.composition.task03.entity;

import java.util.List;

public class State {

	private String stateName;
	private String capital;
	private List<Area> areas;
	private double theAreaOfTheState;

	public State(String stateName, String capital, List<Area> areas, double theAreaOfTheState) {
		this.stateName = stateName;
		this.capital = capital;
		this.areas = areas;
		this.theAreaOfTheState = theAreaOfTheState;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}
	

	public double getTheAreaOfTheState() {
		return theAreaOfTheState;
	}

	public void setTheAreaOfTheState(double theAreaOfTheState) {
		this.theAreaOfTheState = theAreaOfTheState;
	}

	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", capital=" + capital + ", areas=" + areas + ", theAreaOfTheState="
				+ theAreaOfTheState + "]";
	}

	

}

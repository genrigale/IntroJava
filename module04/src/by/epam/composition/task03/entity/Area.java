package by.epam.composition.task03.entity;

import java.util.List;

public class Area {

	private String areaName;
	private String regionalCenter;
	private List<District> districts;

	public Area(String areaName, String regionalCenter, List<District> districts) {
		this.areaName = areaName;
		this.regionalCenter = regionalCenter;
		this.districts = districts;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getRegionalCenter() {
		return regionalCenter;
	}

	public void setRegionalCenter(String regionalCenter) {
		this.regionalCenter = regionalCenter;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	@Override
	public String toString() {
		return "Area [areaName=" + areaName + ", regionalCenter=" + regionalCenter + ", districts=" + districts + "]";
	}

}

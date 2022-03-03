package by.epam.composition.task03.entity;

public class District {

	private String districtName;
	private City city;

	public District(String districtName, City city) {
		this.districtName = districtName;
		this.city = city;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "District [districtName=" + districtName + ", city=" + city + "]";
	}

}

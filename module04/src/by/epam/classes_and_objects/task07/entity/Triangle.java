package by.epam.classes_and_objects.task07.entity;

public class Triangle {

	private int sideAB;
	private int sideBC;
	private int sideCA;
	
	private Coord coordA;
	private Coord coordB;
	private Coord coordC;	

	public Triangle(int sideAB, int sideBC, int sideCA, Coord coordA, Coord coordB, Coord coordC) {
		this.sideAB = sideAB;
		this.sideBC = sideBC;
		this.sideCA = sideCA;
		this.coordA = coordA;
		this.coordB = coordB;
		this.coordC = coordC;
	}

	public int getSideA() {
		return sideAB;
	}

	public void setSideA(int sideAB) {
		this.sideAB = sideAB;
	}

	public int getSideB() {
		return sideBC;
	}

	public void setSideB(int sideBC) {
		this.sideBC = sideBC;
	}

	public int getSideC() {
		return sideCA;
	}

	public void setSideC(int sideCA) {
		this.sideCA = sideCA;
	}

	public Coord getCoordA() {
		return coordA;
	}

	public void setCoordA(Coord coordA) {
		this.coordA = coordA;
	}

	public Coord getCoordB() {
		return coordB;
	}

	public void setCoordB(Coord coordB) {
		this.coordB = coordB;
	}

	public Coord getCoordC() {
		return coordC;
	}

	public void setCoordC(Coord coordC) {
		this.coordC = coordC;
	}

	@Override
	public String toString() {
		return "Triangle [sideAB=" + sideAB + ", sideBC=" + sideBC + ", sideCA=" + sideCA + ", coordA=" + coordA
				+ ", coordB=" + coordB + ", coordC=" + coordC + "]";
	}

	

	
	
	
	
	

}

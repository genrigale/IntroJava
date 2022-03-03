package by.epam.oop.task05A.bean;




import java.util.Map;

public class Bouquet {

	private Map<Flower, Integer> flowers;
	private Pack pack;
	private int totalPrice;

	public Bouquet() {

	}

	public Map<Flower, Integer> getFlowers() {
		return flowers;
	}

	public void setFlowers(Map<Flower, Integer> flowers) {
		this.flowers = flowers;
	}

	public Pack getPack() {
		return pack;
	}

	public void setPack(Pack pack) {
		this.pack = pack;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flowers == null) ? 0 : flowers.hashCode());
		result = prime * result + ((pack == null) ? 0 : pack.hashCode());
		result = prime * result + totalPrice;
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
		Bouquet other = (Bouquet) obj;
		if (flowers == null) {
			if (other.flowers != null)
				return false;
		} else if (!flowers.equals(other.flowers))
			return false;
		if (pack != other.pack)
			return false;
		if (totalPrice != other.totalPrice)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bouquet [flowers=" + flowers + ", pack=" + pack + ", totalPrice=" + totalPrice + "]";
	}

}

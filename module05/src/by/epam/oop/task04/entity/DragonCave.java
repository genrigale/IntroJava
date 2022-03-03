package by.epam.oop.task04.entity;

public class DragonCave {

	private String greeting = "Добро пожаловать в пещеру дракона!";
	private Chest chest;

	public DragonCave(Chest chest) {
		System.out.println(greeting);
		this.chest = chest;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public Chest getChest() {
		return chest;
	}

	public void setChest(Chest chest) {
		this.chest = chest;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chest == null) ? 0 : chest.hashCode());
		result = prime * result + ((greeting == null) ? 0 : greeting.hashCode());
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
		DragonCave other = (DragonCave) obj;
		if (chest == null) {
			if (other.chest != null)
				return false;
		} else if (!chest.equals(other.chest))
			return false;
		if (greeting == null) {
			if (other.greeting != null)
				return false;
		} else if (!greeting.equals(other.greeting))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DragonCave [greeting=" + greeting + ", chest=" + chest.getName() + "]";
	}

}

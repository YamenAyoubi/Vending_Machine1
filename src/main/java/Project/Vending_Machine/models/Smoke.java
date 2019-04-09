package Project.Vending_Machine.models;

public class Smoke extends Products{

	private static int sequencer = 1000;
	private int id;
	
	public Smoke(String name, double price) {
		super(name, price);
		this.id=sequencer++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = sequencer++;
	}
	@Override
	public String toString() {
		return "Smoke [id=" + id + ", Name=" + getName() + ", Price=" + getPrice()
				+ "]";
	}
}

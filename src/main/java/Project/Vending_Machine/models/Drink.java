package Project.Vending_Machine.models;

public class Drink extends Products{

	private static int sequencer = 100000;
	private int id;
	
	public Drink(String name, double price) {
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
		return "Drink [id=" + id + ", Name=" + getName() + ", Price=" + getPrice()
				+ "]";
	}

}
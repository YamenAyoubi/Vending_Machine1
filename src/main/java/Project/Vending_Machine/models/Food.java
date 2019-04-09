package Project.Vending_Machine.models;

public class Food extends Products{

	private static int sequencer = 1000000;
	private int id;
	
	
	public Food(String name, double price) {
		super(name, price);
		this.id=sequencer++;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = sequencer++;;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", Name" + getName() + ", Price=" + getPrice()
				+ "]";
	}

}

package Project.Vending_Machine;

public class Products {

	private static int sequencer = 10000;
	protected String Name ;
	protected double Price;
	protected int ID;
	
	public Products (String Name ,double Price, int ID) {
		
		this.Name=Name;
		this.Price=Price;
		this.ID=sequencer++;
	}
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double Price) {
		this.Price = Price;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = sequencer++;
	}
	
	public void RemainsCalculation () {
		
	}
}

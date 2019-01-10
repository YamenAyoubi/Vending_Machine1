package Project.Vending_Machine;

public class Food extends Products{

	private String Snacks;
	private String Sandwich;

	public Food(String Name, int Price, int ID ) {
		super(Name, Price, ID );
        this.Price=getPrice();
        this.ID=getID();
        this.Name=getName();
	}

	public String getSnacks() {
		return Snacks;
	}

	public void setSnacks(String snacks) {
		Snacks = snacks;
	}

	public String getSandwich() {
		return Sandwich;
	}

	public void setSandwich(String sandwich) {
		Sandwich = sandwich;
	}

}

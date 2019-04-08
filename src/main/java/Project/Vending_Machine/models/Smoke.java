package Project.Vending_Machine.models;

public class Smoke extends Products{

	
	public Smoke(String Name, int Price, int ID) {
		super(Name, Price, ID);

        this.Price=getPrice();
        this.ID=getID();
        this.Name=getName();
	}
}

package Project.Vending_Machine;

public class Drink extends Products{



	public Drink(String Name, int Price, int ID ) {
		super(Name, Price, ID);
        this.Price=getPrice();
        this.ID=getID();
        this.Name=getName();		
	}

}

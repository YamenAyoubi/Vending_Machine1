package Project.Vending_Machine;

public class Food extends Products{

	public Food(String Name, int Price, int ID ) {
		super(Name, Price, ID );
        this.Price=getPrice();
        this.ID=getID();
        this.Name=getName();

	}
}

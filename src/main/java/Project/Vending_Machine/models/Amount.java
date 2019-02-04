package Project.Vending_Machine.models;

public class Amount {

	private static int Amount ;

	public Amount(int amount) {

		Amount = amount;
	}

	public static int getAmount() {
		return Amount;
	}

	public static int setAmount(int amount) {
		return Amount = amount;
	}

}

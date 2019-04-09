package Project.Vending_Machine.models;

public class Products {

	private static int sequencer = 10000;
	private String name ;
	private double price;
	private int id;
	
	public Products(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		this.id=sequencer++;
		
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double Price) {
		this.price = Price;
	}
	public int getID() {
		return id;
	}
	public void setID(int iD) {
		id = sequencer++;
	}


	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Products other = (Products) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Products [Name=" + name + ", Price=" + price + ", ID=" + id + "]";
	}
	
}
package Project.Vending_Machine.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import Project.Vending_Machine.models.Drink;
import Project.Vending_Machine.models.Food;
import Project.Vending_Machine.models.Products;
import Project.Vending_Machine.models.Smoke;
import Project.Vending_Machine.utilities.DoYouWannaBuyMore;
import Project.Vending_Machine.utilities.RemainsDetails;
import Project.Vending_Machine.utilities.ValidNumber;

public class Operations {
 
	static List<Products> shoppingList = new ArrayList<>();
	public static void Go() {
		Amount am=new Amount();
		LocalDate Date = LocalDate.now();
		LocalTime Time = LocalTime.now();
		
		System.out.println("     Welcome To The Vending Machine       ");
		System.out.println("     Opening Date    "+Date+" ");
		System.out.println("     Opening Time    "+Time+" ");
		System.out.println("==========================================");
		System.out.println("Pls Enter The Amount You Wanna Use To Buy ");
		System.out.println("==========================================");

		
		am.setAmount(ValidNumber.getNumber());

		boolean HaveBalance = true;

		while (HaveBalance) {

			System.out.println("Your Balance :" + " " + am.getAmount() + " " +"SEK " + "\nplease select From The List" + "\n1-Food"
					+ "\n2-Drink" + "\n3-Smoke");

			int operation = ValidNumber.getNumber();

			switch (operation) {

			case 1:
				CaseOneActions(am);
				break;
			case 2:
				CaseTwoActions(am);
				break;
			case 3:
				CaseThreeActions(am);
				break;
			default:
				System.out.println("Worng Entry PLs check the Options");
			}

			System.out.println("Do You Want To Buy Again ? (Y/N)");
			if(HaveBalance = DoYouWannaBuyMore.PlayAgain()) {
				
			}else {
				System.out.println("Please Find Below List Of Your Selected Products");
				for (Products products : shoppingList) {
					System.out.println(products);
				}
				RemainsDetails.PrintRemainsDetails(am.getAmount());
			}
		}
	}
	
public static void CaseOneActions(Amount am) {
		
		System.out.println("Welcome To Food Section please select from below list");

		System.out.println("\n1-Sandwich" + "\n2-Snacks");

		Products product1 = new Food("Pringels", 20);
		Products product2 = new Food("Snack", 25);
		Products product3 = new Food("chicken ", 35);
		Products product4 = new Food("Beef", 40);
		
		boolean HaveBalance = true;
		int Selection = ValidNumber.getNumber();

		while (HaveBalance) {

			if (Selection == 1) {
				System.out.println("11:" + " " + product3.getName() + " " + "Price is :" + product3.getPrice());
				System.out.println("12:" + " " + product4.getName() + " " + "Price is :" + product4.getPrice());
				Selection = ValidNumber.getNumber();
				if (Selection == 11) {
					paymentCalculations(product3,am);
					shoppingList.add(product3);
					break;
				}
		
			if (Selection == 12) {
				paymentCalculations(product4,am);
				shoppingList.add(product4);
				break;
			}
		}

		if (Selection == 2) {
			System.out.println("21:" + " " + product1.getName() + " " + "Price is :" + product1.getPrice());
			System.out.println("22:" + " " + product2.getName() + " " + "Price is :" + product2.getPrice());
			Selection = ValidNumber.getNumber();

			if (Selection == 21) {
				paymentCalculations(product1,am);
				shoppingList.add(product1);
				break;
			}

			if (Selection == 22) {
				paymentCalculations(product2,am);
				shoppingList.add(product2);
				break;
			}
		}
	}
}

public static void CaseTwoActions(Amount am) {

	System.out.println(
			"Welcome To Drink Section please select from below list" + "\n1-NonAlcoholic " + "\n2-Alcoholic");

	Products product5 = new Drink("coke", 15);
	Products product6 = new Drink("Water", 15);
	Products product7 = new Drink("Beer", 45);
	Products product8 = new Drink("Wiscky", 85);

	boolean HaveBalance = true;

	int Selection = ValidNumber.getNumber();

	while (HaveBalance) {

		if (Selection == 1) {
			System.out.println("11:" + " " + product5.getName() + " " + "Price is :" + product5.getPrice());
			System.out.println("12:" + " " + product6.getName() + " " + "Price is :" + product6.getPrice());
			Selection = ValidNumber.getNumber();
			if (Selection == 11) {
				paymentCalculations(product5,am);
				shoppingList.add(product5);
				break;
			}

			if (Selection == 12) {
				paymentCalculations(product6,am);
				shoppingList.add(product6);
				break;
			}
		}

		if (Selection == 2) {
			System.out.println("21:" + " " + product7.getName() + " " + "Price is :" + product7.getPrice());
			System.out.println("22:" + " " + product8.getName() + " " + "Price is :" + product8.getPrice());
			Selection = ValidNumber.getNumber();
			if (Selection == 21) {
				paymentCalculations(product7,am);
				shoppingList.add(product7);
				break;
			}

			if (Selection == 22) {
				paymentCalculations(product8,am);
				shoppingList.add(product8);
				break;
			}
		}
	}
}

public static void CaseThreeActions(Amount am) {

	System.out.println("Welcome To Smoke Section please select from below list" + "\n1-Cigarettes " + "\n2-Tools");
	Products product9 = new Smoke("Malbouro", 85);
	Products product10 = new Smoke("Winston", 55);
	Products product11 = new Smoke("Lighter", 45);
	Products product12 = new Smoke("MatchStick", 10);

	boolean HaveBalance = true;

	int Selection = ValidNumber.getNumber();

	while (HaveBalance) {

		if (Selection == 1) {
			System.out.println("11:" + " " + product9.getName() + " " + "Price is :" + product9.getPrice());
			System.out.println("12:" + " " + product10.getName() + " " + "Price is :" + product10.getPrice());
			Selection = ValidNumber.getNumber();
			if (Selection == 11) {
				paymentCalculations(product9,am);
				shoppingList.add(product9);
				break;
			}

			if (Selection == 12) {
				paymentCalculations(product10,am);
				shoppingList.add(product10);
				break;
			}
		}

		if (Selection == 2) {
			System.out.println("21:" + " " + product11.getName() + " " + "Price is :" + product11.getPrice());
			System.out.println("22:" + " " + product12.getName() + " " + "Price is :" + product12.getPrice());
			Selection = ValidNumber.getNumber();
			if (Selection == 21) {
				paymentCalculations(product11,am);
				shoppingList.add(product11);
				break;
			}

			if (Selection == 22) {
				paymentCalculations(product12,am);
				shoppingList.add(product12);
				break;
			}
		}
	}
}

public static void paymentCalculations(Products product, Amount am2) {

	if (am2.getAmount() > product.getPrice()) {
		System.out.println("Your Product ID Is:" + product.getID());
		am2.setAmount((int) (am2.getAmount() - product.getPrice()));
		System.out.println(
				"Enjoy Your " + " " + product.getName() + " " + "Your Remains Amount is : " + am2.getAmount()+ " " +"SEK");

	} else {
		System.out.println("Pls Enter Add More Amount ");
		am2.setAmount(am2.getAmount() + ValidNumber.getNumber());
		System.out.println("Your New Balance = " + " " + am2.getAmount()+" " +"SEK");

	}
}

}

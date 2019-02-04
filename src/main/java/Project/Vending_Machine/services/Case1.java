package Project.Vending_Machine.services;

import Project.Vending_Machine.models.Food;
import Project.Vending_Machine.utilities.AmountValidity;
import Project.Vending_Machine.utilities.DoYouWannaBuyMore;
import Project.Vending_Machine.utilities.RemainsDetails;
import Project.Vending_Machine.utilities.ValidNumber;

public class Case1 {

	public static void CaseOneActions() {

		System.out.println("Welcome To Food Section please select from below list");
		System.out.println("\n1-Sandwich" + "\n2-Snacks");

		Food product1 = new Food("Pringels", 20, 0);
		Food product2 = new Food("Snack", 25, 0);
		Food product3 = new Food("chicken ", 35, 0);
		Food product4 = new Food("Beef", 40, 0);

		int Amount = Project.Vending_Machine.models.Amount.getAmount();
		int Remains = Amount;

		boolean HaveBalance = true;

		Amount = Remains;
		int Selection = ValidNumber.getNumber();

		while (HaveBalance) {

			if (Selection == 1) {
				System.out.println("11:" + " " + product3.getName() + " " + "Price is :" + product3.getPrice());
				System.out.println("12:" + " " + product4.getName() + " " + "Price is :" + product4.getPrice());
				Selection = ValidNumber.getNumber();
				if (Selection == 11) {
					if (AmountValidity.CheckTheAmountValidity(Amount, Remains, product3.getPrice())) {
						System.out.println("Your Product ID Is:" + product3.getID());
						Remains = (int) (Amount - product3.getPrice());
						System.out.println(
								"Enjoy Your " + " " + product3.getName() + " " + "Your Remains Amount is : " + Remains);
						Project.Vending_Machine.models.Amount.setAmount(Remains);
						break;
					}
					System.out.println("Pls Enter Add More Amount ");
					int NewAmount = ValidNumber.getNumber();
					Remains = NewAmount + Amount;
					System.out.println("Your New Balance = " + " " + Remains);
					HaveBalance = true;
					break;
				}

				if (Selection == 12) {

					if (AmountValidity.CheckTheAmountValidity(Amount, Remains, product4.getPrice())) {
						System.out.println("Your Product ID Is:" + product4.getID());
						Remains = (int) (Amount - product4.getPrice());
						System.out.println(
								"Enjoy Your " + " " + product4.getName() + " " + "Your Remains Amount is : " + Remains);
						Project.Vending_Machine.models.Amount.setAmount(Remains);
						break;
					}
					System.out.println("Pls Enter Add More Amount ");
					int NewAmount = ValidNumber.getNumber();
					Remains = NewAmount + Amount;
					System.out.println("Your New Balance = " + " " + Remains);
					HaveBalance = true;
					break;
				}
			}

			if (Selection == 2) {
				System.out.println("21:" + " " + product1.getName() + " " + "Price is :" + product1.getPrice());
				System.out.println("22:" + " " + product2.getName() + " " + "Price is :" + product2.getPrice());
				Selection = ValidNumber.getNumber();

				if (Selection == 21) {
					if (AmountValidity.CheckTheAmountValidity(Amount, Remains, product1.getPrice())) {
						System.out.println("Your Product ID Is:" + product1.getID());
						Remains = (int) (Amount - product1.getPrice());
						System.out.println(
								"Enjoy Your " + " " + product1.getName() + " " + "Your Remains Amount is : " + Remains);
						Project.Vending_Machine.models.Amount.setAmount(Remains);
						break;
					}

					System.out.println("Pls Enter Add More Amount ");
					int NewAmount = ValidNumber.getNumber();
					Remains = NewAmount + Amount;
					System.out.println("Your New Balance = " + " " + Remains);
					HaveBalance = true;
					break;
				}

				if (Selection == 22) {

					if (AmountValidity.CheckTheAmountValidity(Amount, Remains, product2.getPrice())) {
						System.out.println("Your Product ID Is:" + product2.getID());
						Remains = (int) (Amount - product2.getPrice());
						System.out.println(
								"Enjoy Your " + " " + product2.getName() + " " + "Your Remains Amount is : " + Remains);
						Project.Vending_Machine.models.Amount.setAmount(Remains);
						break;
					}

					System.out.println("Pls Enter Add More Amount ");
					int NewAmount = ValidNumber.getNumber();
					Remains = NewAmount + Amount;
					System.out.println("Your New Balance = " + " " + Remains);
					HaveBalance = true;
					break;
				}

			}
		}
	}
}
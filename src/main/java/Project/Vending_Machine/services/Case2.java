package Project.Vending_Machine.services;

import Project.Vending_Machine.models.Drink;
import Project.Vending_Machine.utilities.AmountValidity;
import Project.Vending_Machine.utilities.DoYouWannaBuyMore;
import Project.Vending_Machine.utilities.RemainsDetails;
import Project.Vending_Machine.utilities.ValidNumber;

public class Case2 {

	public static void CaseTwoActions() {

		System.out.println(
				"Welcome To Drink Section please select from below list" + "\n1-NonAlcoholic " + "\n2-Alcoholic");

		Drink product5 = new Drink("coke", 15, 0);
		Drink product6 = new Drink("Water", 15, 0);
		Drink product7 = new Drink("Beer", 45, 0);
		Drink product8 = new Drink("Wiscky", 85, 0);

		int Amount = Project.Vending_Machine.models.Amount.getAmount();
		int Remains = Amount;

		boolean HaveBalance = true;

		Amount = Remains;
		int Selection = ValidNumber.getNumber();

		while (HaveBalance) {

			if (Selection == 1) {
				System.out.println("11:" + " " + product5.getName() + " " + "Price is :" + product5.getPrice());
				System.out.println("12:" + " " + product6.getName() + " " + "Price is :" + product6.getPrice());
				Selection = ValidNumber.getNumber();
				if (Selection == 11) {
					if (AmountValidity.CheckTheAmountValidity(Amount, Remains, product5.getPrice())) {
						System.out.println("Your Product ID Is:" + product5.getID());
						Remains = (int) (Amount - product5.getPrice());
						System.out.println(
								"Enjoy Your " + " " + product5.getName() + " " + "Your Remains Amount is : " + Remains);
						Remains = Project.Vending_Machine.models.Amount.setAmount(Remains);
						break;
					}
					System.out.println("Pls Enter Add More Amount ");
					int NewAmount = ValidNumber.getNumber();
					Remains = NewAmount + Project.Vending_Machine.models.Amount.getAmount();
					System.out.println("Your New Balance = " + " " + Remains);
					HaveBalance = true;
					break;
				}

				if (Selection == 12) {
					if (AmountValidity.CheckTheAmountValidity(Amount, Remains, product6.getPrice())) {
						System.out.println("Your Product ID Is:" + product6.getID());
						Remains = (int) (Amount - product6.getPrice());
						System.out.println(
								"Enjoy Your " + " " + product6.getName() + " " + "Your Remains Amount is : " + Remains);
						Remains = Project.Vending_Machine.models.Amount.setAmount(Remains);
						break;
					}

					System.out.println("Pls Enter Add More Amount ");
					int NewAmount = ValidNumber.getNumber();
					Remains = NewAmount + Project.Vending_Machine.models.Amount.getAmount();
					System.out.println("Your New Balance = " + " " + Remains);
					HaveBalance = true;
					break;
				}
			}

			if (Selection == 2) {
				System.out.println("21:" + " " + product7.getName() + " " + "Price is :" + product7.getPrice());
				System.out.println("22:" + " " + product8.getName() + " " + "Price is :" + product8.getPrice());
				Selection = ValidNumber.getNumber();
				if (Selection == 21) {
					if (AmountValidity.CheckTheAmountValidity(Amount, Remains, product7.getPrice())) {
						System.out.println("Your Product ID Is:" + product7.getID());
						Remains = (int) (Amount - product7.getPrice());
						System.out.println(
								"Enjoy Your " + " " + product7.getName() + " " + "Your Remains Amount is : " + Remains);
						Remains = Project.Vending_Machine.models.Amount.setAmount(Remains);
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
					if (AmountValidity.CheckTheAmountValidity(Amount, Remains, product8.getPrice())) {
						System.out.println("Your Product ID Is:" + product8.getID());
						Remains = (int) (Amount - product8.getPrice());
						System.out.println(
								"Enjoy Your " + " " + product8.getName() + " " + "Your Remains Amount is : " + Remains);
						Remains = Project.Vending_Machine.models.Amount.setAmount(Remains);
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

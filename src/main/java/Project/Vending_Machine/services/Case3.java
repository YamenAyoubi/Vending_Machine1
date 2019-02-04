package Project.Vending_Machine.services;

import Project.Vending_Machine.models.Smoke;
import Project.Vending_Machine.utilities.AmountValidity;
import Project.Vending_Machine.utilities.DoYouWannaBuyMore;
import Project.Vending_Machine.utilities.RemainsDetails;
import Project.Vending_Machine.utilities.ValidNumber;

public class Case3 {

	public static void CaseThreeActions() {

		System.out.println("Welcome To Smoke Section please select from below list" + "\n1-Cigarettes " + "\n2-Tools");
		Smoke product9 = new Smoke("Malbouro", 85, 0);
		Smoke product10 = new Smoke("Winston", 55, 0);
		Smoke product11 = new Smoke("Lighter", 45, 0);
		Smoke product12 = new Smoke("MatchStick", 10, 0);

		int Amount = Project.Vending_Machine.models.Amount.getAmount();
		int Remains = Amount;

		boolean HaveBalance = true;

		Amount = Remains;
		int Selection = ValidNumber.getNumber();

		while (HaveBalance) {

			if (Selection == 1) {
				System.out.println("11:" + " " + product9.getName() + " " + "Price is :" + product9.getPrice());
				System.out.println("12:" + " " + product10.getName() + " " + "Price is :" + product10.getPrice());
				Selection = ValidNumber.getNumber();
				if (Selection == 11) {
					if (AmountValidity.CheckTheAmountValidity(Amount, Remains, product9.getPrice())) {
						System.out.println("Your Product ID Is:" + product9.getID());
						Remains = (int) (Amount - product9.getPrice());
						System.out.println(
								"Enjoy Your " + " " + product9.getName() + " " + "Your Remains Amount is : " + Remains);
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

				if (Selection == 12) {
					if (AmountValidity.CheckTheAmountValidity(Amount, Remains, product10.getPrice())) {
						System.out.println("Your Product ID Is:" + product10.getID());
						Remains = (int) (Amount - product10.getPrice());
						System.out.println("Enjoy Your " + " " + product10.getName() + " " + "Your Remains Amount is : "
								+ Remains);
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

			if (Selection == 2) {
				System.out.println("21:" + " " + product11.getName() + " " + "Price is :" + product11.getPrice());
				System.out.println("22:" + " " + product12.getName() + " " + "Price is :" + product12.getPrice());
				Selection = ValidNumber.getNumber();
				if (Selection == 21) {
					if (AmountValidity.CheckTheAmountValidity(Amount, Remains, product11.getPrice())) {
						System.out.println("Your Product ID Is:" + product11.getID());
						Remains = (int) (Amount - product11.getPrice());
						System.out.println("Enjoy Your " + " " + product11.getName() + " " + "Your Remains Amount is : "
								+ Remains);
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
					if (AmountValidity.CheckTheAmountValidity(Amount, Remains, product12.getPrice())) {
						System.out.println("Your Product ID Is:" + product12.getID());
						Remains = (int) (Amount - product12.getPrice());
						System.out.println("Enjoy Your " + " " + product12.getName() + " " + "Your Remains Amount is : "
								+ Remains);
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

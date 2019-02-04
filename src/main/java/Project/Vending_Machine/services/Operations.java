package Project.Vending_Machine.services;

import java.util.Scanner;

import Project.Vending_Machine.models.Drink;
import Project.Vending_Machine.models.Food;
import Project.Vending_Machine.models.Smoke;
import Project.Vending_Machine.utilities.AmountValidity;
import Project.Vending_Machine.utilities.DoYouWannaBuyMore;
import Project.Vending_Machine.utilities.RemainsDetails;
import Project.Vending_Machine.utilities.ValidNumber;

public class Operations {

	static Scanner in = new Scanner(System.in);

	public static void Go() {

		System.out.println("     Welcome To The Vending Machine       ");
		System.out.println("==========================================");
		System.out.println("Pls Enter The Amount You Wanna Use To Buy ");
		System.out.println("==========================================");

		int Remains = 0;
		int Amount = Project.Vending_Machine.models.Amount.setAmount(ValidNumber.getNumber());
		Remains = Project.Vending_Machine.models.Amount.getAmount();

		boolean HaveBalance = true;

		while (HaveBalance) {

			Amount = Project.Vending_Machine.models.Amount.getAmount();

			System.out.println("Your Balance :" + " " + Amount + " " + "\nplease select From The List" + "\n1-Food"
					+ "\n2-Drink" + "\n3-Smoke");

			int operation = ValidNumber.getNumber();

			switch (operation) {

			case 1:
				Case1.CaseOneActions();
				break;
			case 2:
				Case2.CaseTwoActions();
				break;
			case 3:
				Case3.CaseThreeActions();
				break;
			default:
				System.out.println("Worng Entry PLs check the Options");
			}

			System.out.println("Do You Want To Buy Again ? (Y/N)");
			String answer = DoYouWannaBuyMore.GetPlayAgainAnswer().toUpperCase();
			HaveBalance = DoYouWannaBuyMore.PlayAgain(answer);
			RemainsDetails.PrintRemainsDetails(Remains);
		}
	}

}

package Project.Vending_Machine.utilities;

import java.util.Scanner;

public class ValidNumber {
	static Scanner in = new Scanner (System.in);
	
	public static int getNumber() {
		
		int Number;
		System.out.println("	     Please Enter Number              ");
		System.out.println("==========================================");

		if (in.hasNextDouble()) {
			Number = in.nextInt();
		} else {
			System.out.println("Select from the list Numbers Only. try again.");
			in.next();
			Number = getNumber();
		}
		return Number;
	}

}

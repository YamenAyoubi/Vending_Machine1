package Project.Vending_Machine.utilities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class DoYouWannaBuyMore {
	
	static Scanner in = new Scanner (System.in);
	
		public static boolean PlayAgain(String answer) {
			
			 LocalDate Today = LocalDate.now();
			 LocalTime Now = LocalTime.now();
			 int Remains = Project.Vending_Machine.models.Amount.getAmount();
				
			String upperCaseString = answer.toUpperCase();
	 		switch(upperCaseString) {
	 		case "Y":
	 			System.out.println("Veding Machine Open Again");
	 			return true;
	 		default:
	 			System.out.println(" ಠ_ಠ   See You Soon ಠ_ಠ");
	 			System.out.println("Enjoy The Products Please Collect Your Remains :");
	 			RemainsDetails.PrintRemainsDetails(Remains);
	 			System.out.println("  Closing Date      "+Today+" ");
	 			System.out.println("  Closing Time      "+Now+" ");
	 			return false;
	}
	}
		
		public static String GetPlayAgainAnswer() {
				return in.nextLine();
	}

}
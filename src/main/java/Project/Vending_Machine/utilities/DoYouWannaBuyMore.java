package Project.Vending_Machine.utilities;

import java.util.Scanner;

public class DoYouWannaBuyMore {

		static Scanner in = new Scanner (System.in);
		
		public static boolean PlayAgain(String answer) {
			
			String upperCaseString = answer.toUpperCase();
	 		switch(upperCaseString) {
	 		case "Y":
	 			System.out.println("Veding Machine Open Again");
	 			return true;
	 		default:
	 			System.out.println(" ಠ_ಠ   See You Soon ಠ_ಠ");
	 			System.out.println("Enjoy The Products Please Collect Your Remains :");	
	 			return false;
	}
	}
		
		public static String GetPlayAgainAnswer() {
				return in.nextLine();
	}

}

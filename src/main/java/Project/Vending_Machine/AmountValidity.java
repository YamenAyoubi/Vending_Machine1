package Project.Vending_Machine;

public class AmountValidity {


	public static boolean CheckTheAmountValidity (int A ,int B,double P) {
		
    if (A <= 0 || B <= 0 ||P >A || P > B) {
 	   System.out.println("Not Enough Money Please Add Money ");
 	   
 	   return false;
	}

	return true; }

	}
	

		



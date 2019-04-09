package Project.Vending_Machine.utilities;

public class RemainsDetails {

public static int PrintRemainsDetails(int R) {
		
		int Thousand;
		int FiveHundred ;
		int Hundred ; 
		int Fifty ;
		int Twenty;
		int ten; 
		int five; 
		int one;
		
		Thousand=R/1000;
		
		FiveHundred=R%1000/500;
		
		Hundred=R%1000%500/100;
		
		Fifty=R%1000%500%100/50;
		
		Twenty=R%1000%500%100%50/20;
		
		ten=R%1000%500%100%50%20/10;
		
		five=R%1000%500%100%50%20%10/5;
		
		one=R%1000%500%100%50%20%10%5/1;
				
		System.out.println("The Remains Is :" +" "+ R+" "+"You Will Collect "+
						   "\n" +Thousand+"\t" +"Thousand" +
		                   "\n" +FiveHundred +"\t" +"FiveHundred"+
		                   "\n" +Hundred + "\t" +"Hundred"+
		                   "\n" +Fifty + "\t" +"fivity"+
		                   "\n" +Twenty + "\t" +"Twinty"+
		                   "\n" +ten + "\t" +"tens"+
		                   "\n" +five + "\t" +"fives"+
		                   "\n" +one + "\t" +"one" );
		return R;
	}
}

package Project.Vending_Machine;

import java.util.Scanner;



public interface Main {

	static Scanner in = new Scanner (System.in);

	Food product1 = new Food ("Pringels",20, 0);
	Food product2 = new Food ("Snack",25, 0);
	Food product3 = new Food ("chicken ",35, 0);
	Food product4 = new Food ("Beef",40, 0);
	Drink product5 = new Drink ("coke",15,0);
	Drink product6 = new Drink ("Water",15,0);
	Drink product7 = new Drink ("Beer",45,0);
	Drink product8 = new Drink ("Wiscky",85,0);
	Smoke product9 = new Smoke ("Malbouro",85,0);
	Smoke product10 = new Smoke ("Winston",55,0);
	Smoke product11 = new Smoke ("Lighter",45,0);
	Smoke product12 = new Smoke ("MatchStick",10,0);
	
    public static void main( String[] args )
    {
       System.out.println("Pls Enter The Amount You Wana use to buy As Below  ");
       MoneyList.MoneyValidity();
       int Amount=in.nextInt();
       int Remains = Amount;

       boolean HaveBalance=true;

	while(HaveBalance) { 
  	
    	Amount =Remains;
    	
    	System.out.println("Your Balance :"+ " " +Amount +" " +"\nplease select what you wanna buy" +"\n1-Food"+"\n2-Drink" + "\n3-Smoke");

    	int operation = in.nextInt();
    	
    	switch (operation) {
    	
    	case 1 :
          
    		System.out.println("Welcome To Food Section please select from below list");
    		System.out.println("Pls Select From Below "+"\n1-Sandwich"+"\n2-Snacks");
    		int  Selection = in.nextInt();
    		
    		if (Selection ==1 ) {
        		System.out.println("11:"+" " +product3.getName()+" "+ "Price is :" +product3.getPrice());
        		System.out.println("12:"+" " +product4.getName()+" " +"Price is :"+product4.getPrice());
        		Selection = in.nextInt();
        		if (Selection ==11 ) {
        			if(AmountValidity.CheckTheAmountValidity(Amount, Remains, product3.getPrice())) {
        				System.out.println("Your Product ID Is:" + product3.getID());
            			Remains = (int) (Amount - product3.getPrice());
            			System.out.println("Enjoy Your "+" " +product3.getName() +" " +"Your Remains Amount is : " +Remains);
        			}
        		       System.out.println("Pls Enter Add More Amount ");
        		        int NewAmount=in.nextInt();
        		        Remains = NewAmount + Amount;
        		        System.out.println("Your New Balance = "+" " +Remains);
        		        HaveBalance=true;
        			break;}
        		 
        	            
        	     if (Selection ==12 ) {
        	    	 
         			if(AmountValidity.CheckTheAmountValidity(Amount, Remains, product4.getPrice())) {
        				System.out.println("Your Product ID Is:" + product4.getID());
            			Remains = (int) (Amount - product4.getPrice());
            			System.out.println("Enjoy Your "+" " +product4.getName() +" " +"Your Remains Amount is : " +Remains);}
        			}
  		                System.out.println("Pls Enter Add More Amount ");
  		                int NewAmount=in.nextInt();
  		                Remains = NewAmount + Amount;
  		                System.out.println("Your New Balance = "+" " +Remains);
  		                HaveBalance=true;
        			break;}
    		
    			if (Selection ==2 ) {
    				System.out.println("21:"+" " +product1.getName()+" "+ "Price is :" +product1.getPrice());
    				System.out.println("22:"+" " +product2.getName()+" " +"Price is :"+product2.getPrice());
    				Selection = in.nextInt();
    				
	        		if (Selection ==21 ) {
	         			if(AmountValidity.CheckTheAmountValidity(Amount, Remains, product1.getPrice())) {
	        				System.out.println("Your Product ID Is:" + product1.getID());
	            			Remains = (int) (Amount - product1.getPrice());
	            			System.out.println("Enjoy Your "+" " +product1.getName() +" " +"Your Remains Amount is : " +Remains);}
	        			
  		                	System.out.println("Pls Enter Add More Amount ");
  		                	int NewAmount=in.nextInt();
  		                	Remains = NewAmount + Amount;
  		                	System.out.println("Your New Balance = "+" " +Remains);
  		                	HaveBalance=true;
	        			break;}
        	            
        	     if (Selection ==22 ) {

	         			if(AmountValidity.CheckTheAmountValidity(Amount, Remains, product2.getPrice())) {
	        				System.out.println("Your Product ID Is:" + product2.getID());
	            			Remains = (int) (Amount - product2.getPrice());
	            			System.out.println("Enjoy Your "+" " +product2.getName() +" " +"Your Remains Amount is : " +Remains);}
	        			
  		                	System.out.println("Pls Enter Add More Amount ");
  		                	int NewAmount=in.nextInt();
  		                	Remains = NewAmount + Amount;
  		                	System.out.println("Your New Balance = "+" " +Remains);
  		                	HaveBalance=true;
	        			break;}}
        	         
    	case 2 :
    		
    		System.out.println("Welcome To Drink Section please select from below list" + "\n1-NonAlcoholic " + "\n2-Alcoholic");
    		 	Selection = in.nextInt();
    		
    		if (Selection ==1 ) {
        			System.out.println("11:"+" " +product5.getName()+" "+ "Price is :" +product5.getPrice());
        			System.out.println("12:"+" " +product6.getName()+" " +"Price is :"+product6.getPrice());
        			Selection = in.nextInt();
        		if (Selection ==11 ) {
         			if(AmountValidity.CheckTheAmountValidity(Amount, Remains, product5.getPrice())) {
        				System.out.println("Your Product ID Is:" + product5.getID());
            			Remains = (int) (Amount - product5.getPrice());
            			System.out.println("Enjoy Your "+" " +product5.getName() +" " +"Your Remains Amount is : " +Remains);}
        			
		                System.out.println("Pls Enter Add More Amount ");
		                int NewAmount=in.nextInt();
		                Remains = NewAmount + Amount;
		                System.out.println("Your New Balance = "+" " +Remains);
		                HaveBalance=true;
        			break;}
        	            
        	     if (Selection ==12 ) {
	         			if(AmountValidity.CheckTheAmountValidity(Amount, Remains, product6.getPrice())) {
	        				System.out.println("Your Product ID Is:" + product6.getID());
	            			Remains = (int) (Amount - product6.getPrice());
	            			System.out.println("Enjoy Your "+" " +product6.getName() +" " +"Your Remains Amount is : " +Remains);}
	        			
  		                	System.out.println("Pls Enter Add More Amount ");
  		                	int NewAmount=in.nextInt();
  		                	Remains = NewAmount + Amount;
  		                	System.out.println("Your New Balance = "+" " +Remains);
  		                	HaveBalance=true;
	        			break;}}
    		
    		if (Selection ==2 ) {
        			System.out.println("21:"+" " +product7.getName()+" "+ "Price is :" +product7.getPrice());
        			System.out.println("22:"+" " +product8.getName()+" " +"Price is :"+product8.getPrice());
        			Selection = in.nextInt();
        			if (Selection ==21 ) {
             			if(AmountValidity.CheckTheAmountValidity(Amount, Remains, product7.getPrice())) {
            				System.out.println("Your Product ID Is:" + product7.getID());
                			Remains = (int) (Amount - product7.getPrice());
                			System.out.println("Enjoy Your "+" " +product7.getName() +" " +"Your Remains Amount is : " +Remains);}
            			
             				System.out.println("Pls Enter Add More Amount ");
             				int NewAmount=in.nextInt();
             				Remains = NewAmount + Amount;
             				System.out.println("Your New Balance = "+" " +Remains);
             				HaveBalance=true;
            			break;}  
        	     if (Selection ==22 ) {
	         			if(AmountValidity.CheckTheAmountValidity(Amount, Remains, product8.getPrice())) {
	        				System.out.println("Your Product ID Is:" + product8.getID());
	            			Remains = (int) (Amount - product8.getPrice());
	            			System.out.println("Enjoy Your "+" " +product8.getName() +" " +"Your Remains Amount is : " +Remains);}
	        			
  		                	System.out.println("Pls Enter Add More Amount ");
  		                	int NewAmount=in.nextInt();
  		                	Remains = NewAmount + Amount;
  		                	System.out.println("Your New Balance = "+" " +Remains);
  		                	HaveBalance=true;
	        			break;}}

    	case 3 :
    		
    			System.out.println("Welcome To Smoke Section please select from below list" + "\n1-Cigarettes " + "\n2-Tools");
   		 		Selection = in.nextInt();
 		
 		if (Selection ==1 ) {
     			System.out.println("11:"+" " +product9.getName()+" "+ "Price is :" +product9.getPrice());
     			System.out.println("12:"+" " +product10.getName()+" " +"Price is :"+product10.getPrice());
     			Selection = in.nextInt();
     		if (Selection ==11 ) {
     			if(AmountValidity.CheckTheAmountValidity(Amount, Remains, product9.getPrice())) {
    				System.out.println("Your Product ID Is:" + product9.getID());
        			Remains = (int) (Amount - product9.getPrice());
        			System.out.println("Enjoy Your "+" " +product9.getName() +" " +"Your Remains Amount is : " +Remains);}
    			
	                System.out.println("Pls Enter Add More Amount ");
	                int NewAmount=in.nextInt();
	                Remains = NewAmount + Amount;
	                System.out.println("Your New Balance = "+" " +Remains);
	                HaveBalance=true;
    			break;}
     	            
     		if (Selection ==12 ) {
     			if(AmountValidity.CheckTheAmountValidity(Amount, Remains, product10.getPrice())) {
    				System.out.println("Your Product ID Is:" + product10.getID());
        			Remains = (int) (Amount - product10.getPrice());
        			System.out.println("Enjoy Your "+" " +product10.getName() +" " +"Your Remains Amount is : " +Remains);}
    			
	                System.out.println("Pls Enter Add More Amount ");
	                int NewAmount=in.nextInt();
	                Remains = NewAmount + Amount;
	                System.out.println("Your New Balance = "+" " +Remains);
	                HaveBalance=true;
    			break;}}
 		
 		if (Selection ==2 ) {
     			System.out.println("21:"+" " +product11.getName()+" "+ "Price is :" +product11.getPrice());
     			System.out.println("22:"+" " +product12.getName()+" " +"Price is :"+product12.getPrice());
     			Selection = in.nextInt();
     		if (Selection ==21 ) {
     			if(AmountValidity.CheckTheAmountValidity(Amount, Remains, product11.getPrice())) {
    				System.out.println("Your Product ID Is:" + product11.getID());
        			Remains = (int) (Amount - product11.getPrice());
        			System.out.println("Enjoy Your "+" " +product11.getName() +" " +"Your Remains Amount is : " +Remains);}
    			
	                System.out.println("Pls Enter Add More Amount ");
	                int NewAmount=in.nextInt();
	                Remains = NewAmount + Amount;
	                System.out.println("Your New Balance = "+" " +Remains);
	                HaveBalance=true;
    			break;} 
     	    if (Selection ==22 ) {
     			if(AmountValidity.CheckTheAmountValidity(Amount, Remains, product12.getPrice())) {
    				System.out.println("Your Product ID Is:" + product12.getID());
        			Remains = (int) (Amount - product12.getPrice());
        			System.out.println("Enjoy Your "+" " +product12.getName() +" " +"Your Remains Amount is : " +Remains);}
    			
	                System.out.println("Pls Enter Add More Amount ");
	                int NewAmount=in.nextInt();
	                Remains = NewAmount + Amount;
	                System.out.println("Your New Balance = "+" " +Remains);
	                HaveBalance=true;
    			break;}}
    	}

 
    		System.out.println("Do You Want To Buy Again ? (Y/N)");
    		String answer=DoYouWannaBuyAgain.GetPlayAgainAnswer().toUpperCase();
    		HaveBalance = DoYouWannaBuyAgain.PlayAgain(answer); 
    		System.out.println(Remains);
}
}
}

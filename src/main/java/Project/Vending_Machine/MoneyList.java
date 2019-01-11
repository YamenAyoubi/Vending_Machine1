package Project.Vending_Machine;

import java.util.ArrayList;

public class MoneyList {

public static void MoneyValidity () {
	
		ArrayList<String> MoneyList = new ArrayList<>();
		
		MoneyList.add("1 KR");
		MoneyList.add("5 KR");
		MoneyList.add("10 KR");
		MoneyList.add("20 KR");
		MoneyList.add("50 KR");
		MoneyList.add("100 KR");
		MoneyList.add("500 KR");
		MoneyList.add("1000 KR");
		
		
		for (String List : MoneyList) {
			System.out.println(List);
		}
		
}
}
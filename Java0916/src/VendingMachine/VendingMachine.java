package VendingMachine;

import java.util.Arrays;

public class VendingMachine {
	
	String[] drink = { "아메리카노", "카페모카", "카레라떼", "아이스티" };
	int[] price = { 2000, 3000, 2500, 1500 };
	
	int money;

	public String printMenu(){
		return Arrays.toString(drink)+"\n"+Arrays.toString(price);
	}
	
	public void printMenu(int i, String show_menu, String show_price, int[] price1) {
		for(int k = i+1;k<=3; k++) {
			for(int j =0; j<4; j++) {
				if(price1[k]==price1[j]) {
					show_menu = show_menu.replace(drink[j], "-----");
					show_price = show_price.replace("" + price[j], "-----");
				}
			}
			
		}
		System.out.println(show_menu);
		System.out.println(show_price);
	}
	public boolean showMenu(int input_money) {
		
		int[] price1 = Arrays.copyOf(price, 4);
		Arrays.sort(price1);
		Arrays.toString(price1);
		
		String show_menu = Arrays.toString(drink);
		String show_price = Arrays.toString(price);
		
		
		if(input_money>=price1[3]) {
			printMenu();
			return true;
		}else if(input_money>=price1[2]) {
			printMenu(2, show_menu, show_price, price1);
			return true;
		}else if(input_money>=price1[1]) {
			printMenu(1, show_menu, show_price, price1);
			return true;
		}else if(input_money>=price1[0]) {
			printMenu(0, show_menu, show_price, price1);
			return true;
		}else {
			return false;
		}
			
	}
	public int drinkPrice(int index) {
		return price[index-1];
	}
	public String drinkName(int index) {
		return drink[index-1];
	}
	
}

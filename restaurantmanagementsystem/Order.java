package restaurantmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {

	static Scanner sc = new Scanner(System.in);
	
	static void displayMenu() {
		ArrayList<Menu> m = new ArrayList<>();
		m.add(new Menu("1. Biriyani Combo", 200));
		m.add(new Menu("2. Chinese Combo", 350));
		m.add(new Menu("3. Bada Platter", 150));
		m.add(new Menu("4. Kebab Platter", 200));
		m.add(new Menu("5. Steam Momo", 100));
		m.add(new Menu("6. Panfried Momo", 120));
		
		for(Menu item: m) {
			System.out.println(item.getItemName() + " Rs."+ item.getItemPrice());
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("************** Welcome to Restaurant Management System ***************");
		ArrayList<Bill> bills = new ArrayList<>();
		int total = 0;
		do {
			System.out.println("Do you want to order (y/n)");
			char ch = sc.next().charAt(0);
			switch(ch) {
			
			case 'y' : displayMenu();
					   System.out.println("Enter the food Id");
					   int foodItem = sc.nextInt();
					   int price = 0;
					   switch(foodItem) {
					   
					   case 1: System.out.println("Chicken Biriyani");
					   		   price = 200;
					   		   System.out.println("Enter the quantity");
					   		   int quantity = sc.nextInt();
					   		   bills.add(new Bill("Chicken Biriyani", quantity, price*quantity));
					   		   break;
					   case 2: System.out.println("Chinese Combo");
			   		   		   price = 350;
			   		   		   System.out.println("Enter the quantity");
			   		   		   quantity = sc.nextInt();
			   		   		   bills.add(new Bill("Chinese Combo", quantity, price*quantity));
			   		   		   break;
					   case 3: System.out.println("Bada Platter");
			   		   		   price = 150;
			   		   		   System.out.println("Enter the quantity");
			   		   		   quantity = sc.nextInt();
			   		   		   bills.add(new Bill("Bada Platter", quantity, price*quantity));
			   		   		   break;
					   case 4: System.out.println("Kebab Platter");
			   		   		   price = 200;
			   		   		   System.out.println("Enter the quantity");
			   		   		   quantity = sc.nextInt();
			   		   		   bills.add(new Bill("Kebab Platter", quantity, price*quantity));
			   		   		   break;
					   case 5: System.out.println("Steam Momo");
			   		   		   price = 100;
			   		   		   System.out.println("Enter the quantity");
			   		   		   quantity = sc.nextInt();
			   		   		   bills.add(new Bill("Steam Momo", quantity, price*quantity));
			   		   		   break;
					   case 6: System.out.println("Panfried Momo");
			   		   		   price = 120;
			   		   		   System.out.println("Enter the quantity");
			   		   		   quantity = sc.nextInt();
			   		   		   bills.add(new Bill("Panfried Momo", quantity, price*quantity));
			   		   		   break;
			   		   default : System.out.println("Enter correct Id");
			   		   
					   }
			break;
			
			case 'n' : for(Bill item: bills) {
					   		System.err.println(item.itemName + " " + item.quantity + " "+item.getPrice());
					   		total = total+item.getPrice();
					   }
					System.out.println("Total : "+total);
					System.exit(0);
			}
		}
			while(true);
	}

}

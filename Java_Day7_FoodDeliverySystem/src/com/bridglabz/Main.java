package com.bridglabz;

import java.util.Scanner;

public class Main  {
	FoodManager foodManager =  FoodManager.getInstance();
	Scanner sc = new Scanner(System.in);
	Order order = new Order();
	public static void main(String[] args) {
		Biryani biryani = new Biryani();
		biryani.price = 250;
		Burgger burgger = new Burgger();
		burgger.price = 30;
		AppleJuice appleJuice = new AppleJuice();
		appleJuice.price = 20;
		Pizza pizza = new Pizza();
		pizza.price = 150;
		
		Main main = new Main();
		
		main.foodManager.addFoodItems(biryani);
		main.foodManager.addFoodItems(biryani);
		main.foodManager.addFoodItems(pizza);
		main.foodManager.addFoodItems(appleJuice);
		main.foodManager.addFoodItems(burgger);
		main.showMenu();
	}
	
	void showMenu() {
		int choice = 0;
		do {
			System.out.println("\n1. Show food items");
			System.out.println("2. To Update Food Item");
			System.out.println("3. To Add Food Item");
			System.out.println("4. To Remove Food Item");
			System.out.println("5. To Place the order");
			choice = sc.nextInt();
			switch(choice) {
				case 1: 
					foodManager.printFoodItems();
					break;
				case 2:
					updateFoodItem();
					break;
				case 3:
					addFoodItem();
					break;
				case 4:
					foodManager.removeItem();
					break;
				case 5:
					placeOrder();
					System.out.println(order);
					
				default:
					choice = 10;
			}
		}while(choice != 10);
	}
	
	private void updateFoodItem() {
		
		System.out.print("Enter food name: ");
		String item = sc.next();
		FoodItmes fooditem = foodManager.getFoodItem(item);
		System.out.println(fooditem);
		
		System.out.println("1. change test");
		System.out.println("2. change prize");
		System.out.println("3. change preparation time");
		System.out.println("4. change catagory");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				updateTest(fooditem);
				break;
			case 2:
				System.out.println("Enter new price: ");
				float price = sc.nextFloat();
				fooditem.price = price;
				break;
			 case 3:
	                System.out.println("Enter Preparation time: ");
	                short time = sc.nextShort();
	                fooditem.preparationTime = time;
	                break;
		}
	}
	
	private void updateTest(FoodItmes foodItmes) {
		System.out.println("Change test to");
		System.out.println("1. cheesy");
		System.out.println("2. Sweet");
		System.out.println("3. spicy");
		System.out.println("4. chrisppy");
		int test = sc.nextInt();
		
		switch(test) {
			case 1:
				foodItmes.tast = FoodItmes.Test.CHEESY;
				break;
			case 2:
				foodItmes.tast = FoodItmes.Test.SWEET;
				break;
			case 3:
				foodItmes.tast = FoodItmes.Test.SPICY;
				break;
		}
		System.out.print("fooditems == "+foodItmes);
	}
	
	private void addFoodItem() {
		FoodItmes newFoodItem = new FoodItmes() ;
		System.out.print("Enter food item name: ");
		String name = sc.next();
		newFoodItem.name = name;
		
		System.out.println("Select Test: ");
		System.out.println("1. cheesy");
		System.out.println("2. Sweet");
		System.out.println("3. spicy");
		System.out.println("4. chrisppy");
		int test = sc.nextInt();
		
		switch(test) {
			case 1:
				newFoodItem.tast = FoodItmes.Test.CHEESY;
				break;
			case 2:
				newFoodItem.tast = FoodItmes.Test.SWEET;
				break;
			case 3:
				newFoodItem.tast = FoodItmes.Test.SPICY;
				break;
		}
		
		System.out.print("Enter new price: ");
		float price = sc.nextFloat();
		newFoodItem.price = price;
		
		System.out.println("Enter Preparation time: ");
        short time = sc.nextShort();
        newFoodItem.preparationTime = time;
		
        System.out.println("food item Select category");
        System.out.println("1. juice");
		System.out.println("2. maincource");
		System.out.println("3. STARTER");
		int category = sc.nextInt();
		
		switch(category) {
			case 1:
				newFoodItem.catagory = FoodItmes.Category.JUICE;
				break;
			case 2:
				newFoodItem.catagory = FoodItmes.Category.MAINCOURSE;
				break;
			case 3:
				newFoodItem.catagory = FoodItmes.Category.STARTER;
				break;
		}

        System.out.println("food item Select Type");
        System.out.println("1. Veg");
		System.out.println("2. Non Veg");
		int type = sc.nextInt();
		
		switch(type) {
			case 1:
				newFoodItem.type = FoodItmes.Type.VEG;
				break;
			case 2:
				newFoodItem.type = FoodItmes.Type.NONVEG;
				break;
		}
		foodManager.addFoodItems(newFoodItem);
		System.out.print("fooditems == "+newFoodItem);
	}
	
	private void placeOrder() {
		getFoodItemlist();
		System.out.print("Enter customer Name: ");
		order.customerName = sc.next();
		System.out.print("Enter food item delivery address: ");
		order.deliveryAddress = sc.next();
		System.out.println("Enter food item orderTime: ");
		order.orderTime = java.time.LocalDateTime.now();
	}
	
	private void getFoodItemlist() {
		String foodItemName = "";
		while(!foodItemName.equals("quit")) {
			System.out.print("Enter food items name: ");
			foodItemName = sc.next();
			FoodItmes foodItem = foodManager.getFoodItem(foodItemName);
			if(foodItem != null) {
				System.out.print("Enter food item quantity: ");
				order.quantity = sc.nextInt();
				order.totalPrice += (foodItem.price * order.quantity);
				order.foodItemList.add(foodItem);
			}
			else if(!foodItemName.equals("quit"))
				System.out.println("food item not present");
		}
	}
}

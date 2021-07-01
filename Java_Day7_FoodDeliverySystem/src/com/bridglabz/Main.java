package com.bridglabz;

import java.util.Scanner;

public class Main {
	FoodManager foodManager = new FoodManager();
	
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
		main.foodManager.printFoodItems();
		biryani.printIngredients();
		main.foodManager.printAllVegItems();
		System.out.println(main.foodManager.getFoodCount());
		main.foodManager.printAllNonVegItems();
		
		main.showMenu();
		main.foodManager.printFoodItems();
	}
	
	void showMenu() {
		System.out.println("1. To Update Food Item");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			updateFoodItem();
			break;
		}
	}
	
	private void updateFoodItem() {
		
		System.out.print("Enter food name: ");
		Scanner sc = new Scanner(System.in);
		String item = sc.next();
		FoodItems fooditem = foodManager.getFoodItem(item);
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
		}
	}
	
	private void updateTest(FoodItems foodItem) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Change test to");
		System.out.println("1. cheesy");
		System.out.println("2. Sweet");
		System.out.println("3. spicy");
		System.out.println("4. chrisppy");
		int test = sc.nextInt();
		switch(test) {
			case 1:
				foodItem.tast = FoodItems.Test.CHEESY;
				break;
			case 2:
				foodItem.tast = FoodItems.Test.SWEET;
				break;
			case 3:
				foodItem.tast = FoodItems.Test.SPICY;
				break;
		}
		
	}
}

package com.bridglabz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Biryani biryani = new Biryani();
		biryani.price = 250;
		Burgger burgger = new Burgger();
		burgger.price = 30;
		AppleJuice appleJuice = new AppleJuice();
		appleJuice.price = 20;
		Pizza pizza = new Pizza();
		pizza.price = 150;
		
		FoodManager foodManager = new FoodManager();
		foodManager.addFoodItems(biryani);
		foodManager.addFoodItems(biryani);
		foodManager.addFoodItems(pizza);
		foodManager.addFoodItems(appleJuice);
		foodManager.addFoodItems(burgger);
		foodManager.printFoodItems();
		biryani.printIngredients();
		foodManager.printAllVegItems();
		System.out.println(foodManager.getFoodCount());
		foodManager.printAllNonVegItems();
	
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
		System.out.print("Enter");
	}
}

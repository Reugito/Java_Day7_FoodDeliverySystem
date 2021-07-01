package com.bridglabz;

public class Pizza extends FoodItems implements IVeg {
	public Pizza() {
		type = Type.VEG ;
		catagory = Category.STARTER;
		tast = Test.CHEESY;
		preparationTime = 20;
		name = "Pizza";
	}

	@Override
	public void printIngredients() {
		System.out.println("pizzaIngredients");
	}
}

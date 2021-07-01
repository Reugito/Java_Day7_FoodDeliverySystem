package com.bridglabz;

public class Biryani extends FoodItems implements INonVeg {
	public Biryani() {
		type = Type.NONVEG ;
		catagory = Category.MAINCOURSE ;
		tast = Test.SPICY;
		preparationTime = 40;
		name = "Biryani";
	}

	@Override
	public void printIngredients() {
		System.out.println("biryani ingredients");
	}
}

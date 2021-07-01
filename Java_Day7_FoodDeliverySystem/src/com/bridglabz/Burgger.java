package com.bridglabz;

public class Burgger extends FoodItems implements IVeg {
	public Burgger() {
		type = Type.VEG ;
		catagory = Category.STARTER;
		tast = Test.CRISPPY;
		preparationTime = 10;
		name = "Burgger";
	}

	@Override
	public void printIngredients() {
		System.out.println("Burgger ingredients");
	}
}

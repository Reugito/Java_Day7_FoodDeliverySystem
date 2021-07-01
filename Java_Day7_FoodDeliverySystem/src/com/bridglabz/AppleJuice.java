package com.bridglabz;

public class AppleJuice extends FoodItems implements IVeg {
	public AppleJuice() {
		type = Type.VEG ;
		catagory = Category.JUICE;
		tast = Test.SWEET;
		preparationTime = 10;
		name = "AppleJuice";
	}

	@Override
	public void printIngredients() {
		System.out.println("Applejuice ingredients");
	}
}

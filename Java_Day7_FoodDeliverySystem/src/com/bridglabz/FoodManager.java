package com.bridglabz;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class FoodManager {
	Set<FoodItems> foodList = new HashSet();
	
	void addFoodItems(FoodItems foodItem) {
		foodList.add(foodItem);
	}
	
	void printFoodItems() {
		for(FoodItems Items: foodList) {
			System.out.println(Items);
		}
	}
	
	void removeItem(FoodItems foodItem) {
		foodList.remove(foodItem);
	}
	
	void printAllVegItems() {
		for(FoodItems elements: foodList) {
			if(elements instanceof IVeg) 
				System.out.println(elements);
		}
	}
	public int getFoodCount() {
		return foodList.size();
	}
	
	void printAllNonVegItems() {
		for(FoodItems elements: foodList) {
			if(elements instanceof INonVeg) 
				System.out.println(elements);
		}
	}
	FoodItems getFoodItem(String name) {
		Iterator iterator = foodList.iterator();
		for(FoodItems elements : foodList ) {
			if (iterator.hasNext()) {
				FoodItems fooditem = (FoodItems) iterator.next();
				if(fooditem.name.equalsIgnoreCase(name)) {
					return fooditem;
				}
			}		
		}
		return null;	
	}
}

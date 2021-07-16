package com.bridglabz;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
	enum payementmethod {COD, CREDIT_CARD, DEBIT_CARD, NETBANKING, UPI, WALLET};
	String deliveryAddress;
	String customerName;
	int quantity;
	List<FoodItmes> foodItemList = new ArrayList();
	float totalPrice = 0;
	LocalDateTime orderTime;
	
	@Override
	public String toString() {
		return "Order [deliveryAddress=" + deliveryAddress + ", customerName=" + customerName + ", quantity=" + quantity
				+ ", foodItemList=" + foodItemList + ", totalPrice=" + totalPrice + ", orderTime=" + orderTime + "]";
	}
}

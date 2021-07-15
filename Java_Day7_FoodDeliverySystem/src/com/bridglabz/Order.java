package com.bridglabz;

public class Order {
	enum payementmethod {COD, CREDIT_CARD, DEBIT_CARD, NETBANKING, UPI, WALLET};
	String dropLcation;
	String personName;
	int quantity;
	String foodItem;
	int total;
	double orderTime;
}

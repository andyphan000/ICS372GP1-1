package edu.ics372.gp1;

import java.util.Calendar;

public class Transaction {
	private String memberID;
	private Calendar date;
	private double totalPrice;

	public Transaction(String memberID, double totalPrice) {
		this.memberID = memberID;
		this.totalPrice = totalPrice;
		this.date = new Calendar();
	}
}

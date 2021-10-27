package edu.ics372.gp1.collections;

import java.util.List;

import edu.ics372.gp1.Transaction;

public class TransactionList {
	private List<Transaction> transactions;
	private Iterator transactionIterator;

	private TransactionList() {

	}

	public static TransactionList getInstance() {

	}

	public Iterator getTransactions() {
		return this.transactionIterator;
	}

	public boolean insertTransaction() {

	}
}

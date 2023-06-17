package com.jspiders.multithreading.resources;

public class Account {
	double account_balance;

	public Account(double balance) {
		this.account_balance = balance;
	}

	public double checkBalance() {
		return account_balance;
	}

	public synchronized void depositBalance(double ammount) {
		System.out.println("depositing " + ammount + " in account");
		System.out.println("current balance is " + checkBalance());
	}

	public synchronized void withdraw(double ammount) {
		System.out.println("withdrawing " + ammount + " from account");
		System.out.println("current balance is " + checkBalance());
	}
}

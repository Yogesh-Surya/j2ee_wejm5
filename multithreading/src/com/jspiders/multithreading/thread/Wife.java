package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resources.Account;

public class Wife extends Thread {
	Account account;

	public Wife(Account account) {
		this.account = account;
	}

	public void run() {
		account.depositBalance(500);
		account.withdraw(5000);
	} 
}

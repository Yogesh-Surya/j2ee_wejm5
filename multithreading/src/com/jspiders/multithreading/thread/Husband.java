package com.jspiders.multithreading.thread;

import java.security.PublicKey;

import com.jspiders.multithreading.resources.Account;

public class Husband extends Thread {
	Account account;

	public Husband(Account account) {
		this.account = account;
	}

	public void run() {
		account.depositBalance(1000);
		account.withdraw(500);
	}
}

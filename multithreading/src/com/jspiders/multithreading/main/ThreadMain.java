package com.jspiders.multithreading.main;

import com.jspiders.multithreading.thread.MyThread1;
import com.jspiders.multithreading.thread.MyThread2;

public class ThreadMain {

	public static void main(String[] args) {
		MyThread3 myThread3 = new  MyThread3();
		myThread3.setName("Thread 3");
		myThread3.start();
	}

}

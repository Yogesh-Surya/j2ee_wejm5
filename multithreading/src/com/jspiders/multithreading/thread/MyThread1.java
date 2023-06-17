package com.jspiders.multithreading.thread;

import java.util.Iterator;

public class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("The name of the thread is :"+ this.getName());
		System.out.println("The priority of the thread : "+ this.getPriority());
		}
			
	}


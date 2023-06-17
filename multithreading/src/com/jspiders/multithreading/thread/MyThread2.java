package com.jspiders.multithreading.thread;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Ther name of the thread is :"+ Thread.currentThread().getName());
	System.out.println("The thread priority "+ Thread.currentThread().getPriority());
		}
	}

	
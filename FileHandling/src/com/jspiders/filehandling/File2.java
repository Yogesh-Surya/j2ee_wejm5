package com.jspiders.filehandling;

import java.io.File;
import java.io.IOException;

public class File2 {
	public static void main(String[] args) {
		File file = new File("C:\\jwejm5\\yogesh.txt");
		if (file.exists()) {
			System.out.println("File is already exists");
		} else {

			try {
				file.createNewFile();
				System.out.println("File created successefully");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("The name of the file is " + file.getName());
		System.out.println("The path of the file is " + file.getPath());
		System.out.println("The length of the file is " + file.getPath());
		if (file.canRead()) {
			System.out.println("file is readable");
		} else {
			System.out.println("file is not-readable");
		}
		if (file.canWrite()) {
			System.out.println("file is writable");
		} else {
			System.out.println("file is not-writable");
		}
		if (file.canExecute()) {
			System.out.println("file is exucutable");
		} else {
			System.out.println("file is not-exucutable");
		}
	}
}

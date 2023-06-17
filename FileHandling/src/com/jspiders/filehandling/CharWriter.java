package com.jspiders.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharWriter {
	public static void main(String[] args) {
		File file = new File("char.txt");
		if (file.exists()) {
			System.out.println("file already exists");
		} else {
			
			try {
				file.createNewFile();
				System.out.println("file created");
			} catch (IOException e) {
				System.out.println("file cannot be created");
				e.printStackTrace();
			}
			try {
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write("this data from program");
				System.out.println("data written into file");
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("file not found");
				e.printStackTrace();
			}
		}
	}
}

package com.jspiders.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWritter {
	public static void main(String[] args) {
		File file = new File("Byte.txt");

		if (file.exists()) {
			System.out.println("file already exist");
		} else {
			try {
				file.createNewFile();
				System.out.println("file created successfully");
			} catch (Exception e) {
				System.out.println("file did not created ");
			}
		}

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(60);
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("canote write in file");
			e.printStackTrace();
		}

	}
}

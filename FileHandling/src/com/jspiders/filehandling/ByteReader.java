package com.jspiders.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteReader {
	public static void main(String[] args) {
		File file = new File("Byte.txt");
		if (file.exists()) {

			try {
				FileInputStream fileInputStream = new FileInputStream(file);
				System.out.println(fileInputStream.read());
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("file not found");
			}

		} else {
			System.out.println("file not found");
		}
	}
}

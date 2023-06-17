package com.jspiders.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharReader {
	public static void main(String[] args) {
		File file = new File("Char.txt");
		if (file.exists()) {
			try {
				FileReader fileReader = new FileReader(file);
				fileReader.read();
				fileReader.close();

				Scanner scanner = new Scanner(file);
				while (scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
					scanner.close();

				}
			} catch (FileNotFoundException e) {
				System.out.println("file not found");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("file not found");
				e.printStackTrace();
			}

		} else {
			System.out.println("file does not exist");
		}
	}
}

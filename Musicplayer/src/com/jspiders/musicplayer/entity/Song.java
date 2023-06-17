package com.jspiders.musicplayer.entity;

import java.util.Scanner;

public class Song {

	public String A = "ArijitSingh";
	public String B = "TheWeeknd";
	public String C = "ArmaanMalik";

	public void album() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your singer : " + " (A) " + A + " (B) " + B + " (C) " + C);

		String singer = sc.next();

		if (singer.equals("A")) {

			System.out.println("Enter the song you want : \n(a) Kesariya \n(b) Apna Bana Le \n(c) Maan Meri Jaan");

		} else if (singer.equals("B")) {

			System.out.println(
					"Enter the song you want : \n (d) I Was Never There \n(e) Blinding Nights \\n(f) Earned It");

		} else if (singer.equals("C")) {
			System.out.println(
					"Enter the song you want : \n (g) Wajah Tum Ho \n(h) SeeneSe Laga Loonga \n(i) Main Rahu Yaa Na Rahu");
		}
	}
}

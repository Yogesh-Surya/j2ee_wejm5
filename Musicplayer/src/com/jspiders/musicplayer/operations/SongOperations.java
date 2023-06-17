package com.jspiders.musicplayer.operations;

import java.util.Scanner;

import com.jspiders.musicplayer.entity.Song;

public class SongOperations extends Song {
	public String a = "Kesariya";
	public String b = "Apna bana le";
	public String c = "Maan Meri Jaan";
	public String d = "I Was Never There";
	public String e = "Blinding Nights";
	public String f = "Earned It";
	public String g = "Wajah Tum Ho ";
	public String h = "Seene Se Laga Loonga";
	public String i = "Main Rahu Yaa Na Rahu";
	public void selectSong() {
	Scanner sc = new Scanner(System.in);
	//System.out.println("Enter the song you want : "+" (a) "+a+" (b) "+b+" (c) "+c);
	String song = sc.next();
	if(song.equals("a")) {
	System.out.println(a+" is playing now ...!!!");
	}
	else if(song.equals("b")) {
	System.out.println(b+" is playing now ...!!!");
	}
	else if(song.equals("c")) {
	System.out.println(c+" is playing now ...!!!");
	}
	else if(song.equals("d")) {
	System.out.println(d+" is playing now ...!!!");
	}
	else if(song.equals("e")) {
	System.out.println(e+" is playing now ...!!!");
	}
	else if(song.equals("f")) {
	System.out.println(f+" is playing now ...!!!");
	}
	else if(song.equals("g")) {
	System.out.println(g+" is playing now ...!!!");
	}
	else if(song.equals("h")) {
	System.out.println(h+" is playing now ...!!!");
	}
	else if(song.equals("i")) {
	System.out.println(i+" is playing now ...!!!");
	}
	else {
		System.out.println("You are not selected any song...");
	}
	}
}

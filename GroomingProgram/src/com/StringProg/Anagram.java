package com.StringProg;

import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter The Statment");
	String s=scan.nextLine();
	int count=0;
	for(char c='a';c<='z';c++) {
		for(int i=0;i<s.length();i++) if(s.charAt(i)==c) count++; 
	}
	if(count>=26) System.out.println("Statment is Anagarm");
	else System.out.println("Statment Not a Anagram");
	scan.close();
	
}
}

package com.abc.assesments;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\java\\program\\output4.txt"));
    //Enter the input and store using variable
		System.out.println("Enter the Integer value and When done enter exit:");
		while(sc.hasNextInt()) {
			String data=sc.next();
			System.out.println(data);
			bw.write(data);
			bw.newLine();
		}
		bw.flush();
		bw.close(); 
		sc.close();
		System.out.println("End");
	}
}

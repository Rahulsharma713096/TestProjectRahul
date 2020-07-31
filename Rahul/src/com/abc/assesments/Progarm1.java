package com.abc.assesments;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Progarm1 {
public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
	BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\java\\program\\output.txt"));
    ArrayList<Integer> al = new ArrayList<Integer>();
//Taking integer value from user and storing in array list
    System.out.println("Enter the interger value and when done enter exit:");
    while(sc.hasNextInt()) {
    	al.add(sc.nextInt());
    }
//Storing Integer value from array list to File
    for(int temp:al) {
    	bw.write(temp);
    	System.out.println(temp);
    }
    bw.flush();    
    bw.close();      sc.close();
    System.out.println("End");
    }
}

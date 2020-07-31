package com.abc.Test;

public class T10 {
public static void main(String[] args) {
	String[][] arrycopy=new String[2][2];
	int x; arrycopy[0]=args;
	x=arrycopy[0].length;
	for(int y=0;y<x;y++) {
		System.out.println(arrycopy[0][y]);
	}
	System.out.println("End");
}
}

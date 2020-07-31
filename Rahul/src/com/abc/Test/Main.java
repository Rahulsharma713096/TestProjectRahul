package com.abc.Test;

public class Main
{
    private static int i=1;
	public static void main(String[] args) 
	{
		//System.out.println("Hello World");
		int i=2;
		Main s = new Main();
		s.someMethod();
	}
	public static void someMethod()
	{
	   
	    System.out.println(i);
	}
}
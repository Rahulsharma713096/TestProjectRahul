package com.abc.Test;

public class T8 {
	enum days{
		MON,TUE,WED,FRI,SAT,SUN
	};
	public static void main(String[] args) {
		System.out.println(days.MON.ordinal());
		System.out.println(days.TUE.ordinal());
		System.out.println(days.WED.ordinal());
		System.out.println(days.FRI.ordinal());
		System.out.println(days.SAT.ordinal());
		System.out.println(days.SUN.ordinal());
		System.out.println(days.valueOf("SUN"));
		
		
	}
}

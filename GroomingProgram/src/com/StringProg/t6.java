package com.StringProg;

public class t6 {
	public static void main(String[] args) {
		Integer inObj=Integer.valueOf(args[args.length-1]);
		int i=inObj.intValue();
		if(args.length>1)
		{
			System.out.println(i);
		}
		if(args.length>0)
		{
			System.out.println(i-1);
		}
		else
			System.out.println(i-2);
	}

}

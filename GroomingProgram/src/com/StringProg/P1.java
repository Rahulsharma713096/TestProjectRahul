package com.StringProg;

import java.util.Scanner;

public class P1 {
	 public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        int l1=A.length(),l2=B.length();
	        /* Enter your code here. Print output to STDOUT. */
	        System.out.println(l1+l2);
	        if(l1<l2) System.out.println("Yes");
	        else System.out.println("No");
	       System.out.print(A.toUpperCase().charAt(0)+A.substring(1,A.length())+" ");
	       System.out.print(B.toUpperCase().charAt(0)+B.substring(1,B.length()));
	 sc.close();
	 }
}

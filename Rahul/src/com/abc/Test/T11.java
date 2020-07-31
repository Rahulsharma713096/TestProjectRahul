package com.abc.Test;

public class T11 {
public static void main(String[] args) {
	String a="ABCD";
	String b=a.toLowerCase();
	b.replace('a','d');
	b.replace('b', 'c');
	System.out.println(b);
	a.replace("A","a");
	System.out.println(a);
	String c = new String("ABCD");
	c.replace('c','a');
	System.out.println(c);
}
}

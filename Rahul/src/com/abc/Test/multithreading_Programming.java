package com.abc.Test;

class newthread extends Thread
{ Thread t;
String name;
newthread(String threadname){
name= threadname;
t=new Thread(this.name);
t.start();
}
public void run() {
	
}
}
public class multithreading_Programming {
public static void main(String[] args) {
	newthread obj1 = new newthread("one");
	newthread obj2 = new newthread("Two");
	try{
		System.out.println(obj1.t.equals(obj2));
	}catch (Exception e) {
		System.out.println("Main Thread Interupted");
		// TODO: handle exception
	}
}
}

package TestQuestions;

public class Q15 {
private static enum Subject{
	PHYSICS,MATH,CHEM;
}
public static void printPhysics() {
	System.out.println("Maths");
}
public static void printmath() {
	System.out.println("Chem");
}
public static void printchem() {
	System.out.println("Physic");
}
public static  void main(String args[]) {
	// TODO Auto-generated method stub
Subject ph = Subject.PHYSICS;
switch(ph) {
case PHYSICS:printPhysics();
case MATH:printmath();
case CHEM:printchem();
break;
}
}
}

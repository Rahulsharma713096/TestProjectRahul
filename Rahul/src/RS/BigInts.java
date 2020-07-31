package RS;
import java.math.*;
import java.util.Scanner;
public class BigInts {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int a=sc.nextInt();
  BigInteger feb=new BigInteger("1");
 
  for(long i=1;i<=a;i++)
  {
	  feb=feb.multiply(BigInteger.valueOf(i));
  }
  System.out.println("The Factorial is:"+feb);
  sc.close();
}
}

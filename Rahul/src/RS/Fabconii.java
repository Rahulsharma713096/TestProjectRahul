package RS;
import java.util.Scanner;
public class Fabconii {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements has to be printed");
	int x=sc.nextInt();
	int b=1,a=0,c=1;
	for(int i=1;i<=x;i++) {
		System.out.println(a);
		
		a=a+b;
		b=c;
		c=a;
		
	}
	sc.close();
}
}

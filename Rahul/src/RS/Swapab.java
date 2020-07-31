package RS;
import java.util.Scanner;
public class Swapab {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A:");
		int a=sc.nextInt();
		System.out.println("Enter the value of B:");
		int b=sc.nextInt();
		//Logic 1
		a=a+b-(b=a);
		System.out.println("LOGIC1:\n"+"A:"+a+" B:"+b);
		//logic 2
		a=a*b/(b=a);
		System.out.println("LOGIC2:\n"+"A:"+a+" B:"+b);
		//logic 3 efficents from all methods
		a=a^b^(b=a);
		System.out.println("LOGIC3:\n"+"A:"+a+" B:"+b);
		//old method
		int temp; temp=a; a=b; b=temp;
		System.out.println("LOGIC4:\n"+"A:"+a+" B:"+b);
		
		sc.close();
	}

}

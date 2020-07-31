package RS;
import java.util.Scanner;
public class A2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
	long	feb=1;
	for(int i=1;i<=a;i++)
	{
		feb*=i;
	}
	sc.close();
	System.out.println("The factroial is:"+feb);
	}

}

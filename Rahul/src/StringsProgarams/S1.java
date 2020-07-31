package StringsProgarams;
import java.util.Scanner;
public class S1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Statments:");
	String s=sc.nextLine();
	char x[]=s.toCharArray();
	int i=0;
	while(i!=x.length) {
		if(x[i]>='a'&&x[i]<='z') {
		x[i]=(char)(x[i]-32);
		System.out.print(x[i]); }
		else System.out.print(x[i]);
		i++;
	} i=0;
	System.out.println();
	while(i!=x.length) {
		if(x[i]>='A'&&x[i]<='Z') {
		x[i]=(char)(x[i]+32);
		System.out.print(x[i]); }
		else System.out.print(x[i]);
		i++;
	}
	 i=1;
		System.out.print("\n"+((char)(x[0]-32)));
		while(i!=x.length) {
			if((x[i-1]==' '||x[i-1]=='\t')&&(x[i]>='a'&&x[i]<='z')) {
			x[i]=(char)(x[i]-32);
			System.out.print(x[i]); }
			else System.out.print(x[i]);
			i++;
		}
		System.out.println( x);
		sc.close();
}
}

package StringsProgarams;
import java.util.Arrays;
import java.util.Scanner;
public class S2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Sentance:");
  String n=sc.nextLine();
  
	System.out.println(n);
	char x[]=n.toCharArray();
	Arrays.parallelSort(x);
	System.out.println(x);
	sc.close();
}
}

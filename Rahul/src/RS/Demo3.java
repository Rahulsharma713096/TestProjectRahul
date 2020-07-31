package RS;

public class Demo3 {
public static void main(String[] args) {
	int n=20;
	for(int i=0;i<=n;i++) {
		for(int j=0;j<=n;j++) { if(i==j) System.out.print(" ");
		else if(i+j==n)System.out.print(" ");
		else if(j==n/2)System.out.print(" ");
		else if(i==n/2)System.out.print(" ");
		else	System.out.print(".");
		
		}
		System.out.println();
	}
	
}
}


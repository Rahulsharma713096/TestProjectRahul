package RS;

public class Demo4 {
public static void main(String[] args) {
	int n=20;
	for(int i=0;i<=n;i++) {
		for(int j=0;j<=n;j++) { 
			if(i>=6&&i<=14&&j==6) System.out.print(" ");
			else	if(i>=7&&i<=13&&j==7) System.out.print(" ");
			else	if(i>=8&&i<=12&&j==8) System.out.print(" ");
			else	if(i>=9&&i<=11&&j==9) System.out.print(" ");
			else	if(i>=10&&i<=10&&j==10) System.out.print(" ");
			else    if(i==0&&j==0) System.out.print(" ");	
			else    if(i==0&&j==n) System.out.print(" ");	
			else    if(i==n&&j==0) System.out.print(" ");	
			else    if(i==n&&j==n) System.out.print(" ");	
		else 	System.out.print("*");
		
		}
		System.out.println();
	}
	
}
}


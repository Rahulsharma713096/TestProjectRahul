package RS;

public class Demo5 {
public static void main(String[] args) {
	int n=30;
	for(int i=0;i<=n;i++) {
		for(int j=0;j<=n;j++) { 
			if(i==j&&i==n/2&&j==n/2) System.out.print(" 0 ");
			else	if(i==14&&j==16) System.out.print(" o ");
			else	if(i==13&&j==17) System.out.print(" o ");
			else	if(i==13&&j==18) System.out.print(" o ");
			else	if(i==13&&j==19) System.out.print(" o ");
			else	if(i==13&&j==20) System.out.print(" o ");
			else	if(i==13&&j==21) System.out.print(" o ");
			else	if(i==14&&j==22) System.out.print(" o ");
			else	if(i==15&&j==23) System.out.print(" o ");
			else	if(i<=15&&j==23&&i>=10) System.out.print(" 0 ");
			else	if(i==14&&j==14) System.out.print(" 0 ");
			else	if(i==13&&j==13) System.out.print(" 0 ");
			else	if(i==13&&j==12) System.out.print(" 0 ");
			else	if(i==13&&j==11) System.out.print(" 0 ");
			else	if(i==13&&j==10) System.out.print(" 0 ");
			else	if(i==13&&j==9) System.out.print(" 0 ");
			else	if(i==14&&j==8) System.out.print(" 0 ");
			else	if(i==15&&j==7) System.out.print(" 0 ");
			else	if(i<=15&&j==7&&i>=10) System.out.print(" 0 ");
			
		else 	System.out.print(" * ");
		
		}
		System.out.println();
	}
	
}
}


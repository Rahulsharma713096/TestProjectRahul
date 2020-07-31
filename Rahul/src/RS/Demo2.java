package RS;

public class Demo2 {
public static void main(String[] args) {
	//Cap of King or crown
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=50-i-1;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		for(int j=2;j<=i;j++)
		{
			System.out.print("*");
		}
System.out.println();
}   
	//Face of king
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n+36;j++) {
			if(i==2&&j==n+36) System.out.print("@");
		else	System.out.print(" ");
		}
		
		for(int j=1;j<=n+10;j++)
		{  if((i==2&&j==4)||(i==2&&j==12)) System.out.print(" ");
		else 	if((i==3&&j==8)) System.out.print("|");
		else 	if((i==4&&(j==7||j==8||j==9))) System.out.print("-");
		else	System.out.print("*");
		}
		if(i==2) System.out.print("@");
System.out.println();
	}
	//Upper Body of King
	for(int i=1;i<=n+10;i++) {
		for(int j=1;j<=n+31;j++) {
			if((i==1&&j==n+31)||(i==2&&j==n+30)||(i==3&&j==n+29)||(i==4&&j==n+28)||(i==5&&j==n+27)||(i==6&&j==n+26)) System.out.print("*");
		else	if((i==2&&j==n+31)||(i==3&&j==n+30)||(i==4&&j==n+29)||(i==5&&j==n+28)||(i==6&&j==n+27)||(i==7&&j==n+26)) System.out.print("*");
		else	if((i==3&&j==n+31)||(i==4&&j==n+30)||(i==5&&j==n+29)||(i==6&&j==n+28)||(i==7&&j==n+27)||(i==8&&j==n+26)) System.out.print("*");
		else	System.out.print(" ");
		}
		for(int j=1;j<=n+20;j++)
		{ if((i==2&&j==13)||(i==4&&j==13)||(i==6&&j==13)||(i==8&&j==13)||(i==10&&j==13)) System.out.print("@");
			else	System.out.print("*");
		}
		for(int j=1;j<=6;j++)
		{ if((i==1&&j==1)||(i==2&&j==2)||(i==3&&j==3)||(i==4&&j==4)||(i==5&&j==5)||(i==6&&j==6)) System.out.print("*");
		else if((i==2&&j==1)||(i==3&&j==2)||(i==4&&j==3)||(i==5&&j==4)||(i==6&&j==5)||(i==7&&j==6)) System.out.print("*");
		else if((i==3&&j==1)||(i==4&&j==2)||(i==5&&j==3)||(i==6&&j==4)||(i==7&&j==5)||(i==8&&j==6)) System.out.print("*");
		else	System.out.print(" ");
		}
System.out.println();
	}
	//Lower body/legs
	for(int i=1;i<=n+10;i++) {
		for(int j=1;j<=n+31;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=n+20;j++)
		{ if(j==1||j==2||j==3||j==4||j==25||j==24||j==23||j==22) System.out.print("*");
			else	System.out.print(" ");
		}
System.out.println();
	}
	//shoees
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n+56;j++) {
	if(i==1&&(j==34||j==35||j==36||j==37||j==38||j==39||j==40||j==61||j==60||j==59||j==58||j==57||j==56||j==55||j==54||j==53)) System.out.print("*");	
	else if(i==2&&(j==34||j==35||j==36||j==37||j==38||j==39||j==40||j==61||j==60||j==59||j==58||j==57||j==56||j==55||j==54||j==53)) System.out.print("*");
	else if(i==3&&(j==34||j==35||j==36||j==37||j==38||j==39||j==40||j==61||j==60||j==59||j==58||j==57||j==56||j==55||j==54||j==53)) System.out.print("*");
	else if(i==4&&(j==34||j==35||j==36||j==37||j==38||j==39||j==40||j==61||j==60||j==59||j==58||j==57||j==56||j==55||j==54||j==53)) System.out.print("*");
			else	System.out.print(" ");
		}
		System.out.println();
	}
	
}
}

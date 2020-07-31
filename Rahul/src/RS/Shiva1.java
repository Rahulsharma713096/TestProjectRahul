package RS;
import java.util.Scanner;
public class Shiva1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Password");
   String s=sc.nextLine(); s=s.trim(); boolean flag=false; int x=0,y=0,z=0,x1=0;
   for(int i=0;i<=s.length()-1;i++)
   {
	   char c=s.charAt(i);
	   if(c==' '&&c=='\t') {flag=false; System.out.println("NO space Allowed in password"); break; }
	   if(i==0) {
	if(c==' '&&c=='\t') {flag=false; System.out.println("NO space Allowed in password");  break;}
	else	if(c>='0'&&c<='9') { flag=false; System.out.println("Password should not stars with number"); break; }
	else	if(c=='@'||c=='#'||c=='$'||c=='%'||c=='&'||c=='*'||c=='/'||c=='\\') { flag=false; System.out.println("Password should not Stards with Special characters"); break; }
	}
	   if(i>=0){   
	if(c>='A'&&c<='Z') {flag=true; x++;  }
	else	if(c>='a'&&c<='z') {flag=true; y++;  }
	else	if(c>='0'&&c<='9') {flag=true; z++;  }
	else if(c=='@'||c=='#'||c=='$'||c=='%'||c=='&'||c=='*'||c=='/'||c=='\\') { flag=true; x1++;  }
	   }
	   }
   if(x>=1&&y>=1&&z>=1&&x1>=1&&flag==true) { System.out.println("The password is Valid");}
   else if(x>=1&&y>=1&&z>=1) {System.out.println("There is no Spical character in password");}
   else if(x>=1&&y>=1&&x1>=1) {System.out.println("There is no Number   in password");}
   else if(x>=1&&z>=1&&x1>=1) {System.out.println("There is no Small latters  in password");}
   else if(y>=1&&z>=1&&x1>=1) {System.out.println("There is no Captial latter in password");}
   else {System.out.println("Check Password Again \n Password Not valid");}
sc.close();
}
}


package RS;
import java.util.Scanner;
public class shiva {
public static void main(String[] args) {
	Scanner d=new Scanner(System.in);
	System.out.println("Enter the Size of array:");
	int n=d.nextInt();
	int arr[]=new int[n]; 
	int arr1[]=new int[n]; 
	int res[]=new int[n];
	int temp;
	for(int i=0;i<=arr.length-1;i++) 
	{
		System.out.println("Enter The elements at "+i+"Position:");
	   arr[i]=d.nextInt();
	}//sorting starts from here
for(int i=0;i<=arr.length-1;i++)
{
	for(int k=i;k<=arr.length-1;k++)
	{
		if(arr[i]>=arr[k]) 
		{
			temp=arr[i];arr[i]=arr[k];arr[k]=temp;
			}
	
	}
}  
System.out.println("The Sorted array are:");
for(int i=0;i<=arr.length-1;i++) 
{
	System.out.print(arr[i]+" "); 
}
for(int i=arr.length-1,l=0;i>=0;i--,l++) 
{
 arr1[l]=arr[i]; 
}
int i1=0;
int i2=0;
for(int i=0;i<=arr.length-1;i++)
{
	if(i%2==0) { res[i]=arr1[i1];i1++;
	}
	else {
		res[i]=arr[i2];i2++;
		}
} 
System.out.println("Final output are:");
for(int i=0;i<=res.length-1;i++) 
{
	System.out.print(res[i]+" "); 
}
d.close();
}
}

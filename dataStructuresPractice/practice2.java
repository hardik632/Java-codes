package dataStructures;
import java.util.*;
public class practice2 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []a=new int[1000];
	int []b=new int[1000];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
int sum=0;
	int temp=a[0];
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<n;i++)
	{
		if(a[i]%2==0)
		{
			System.out.print(a[i]+" ");
			sum=sum+a[i];
		}
	}
	System.out.print(sum+" ");
	int d=0;
	for(int i=0;i<n;i++)
	{
		if(a[i]%2!=0)
		{
			System.out.print(a[i]+" ");
			d=d+a[i];
		}
	}
	System.out.print(d+" ");		
	
	

}
}

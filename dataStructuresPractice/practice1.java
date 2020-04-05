package dataStructures;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t--!=0)
{
	int m=sc.nextInt();
	int n=sc.nextInt();
	int[]b=new int[m];
	int[]g=new int[n];
	for(int i=0;i<m;i++)
		b[i]=sc.nextInt();
	for(int i=0;i<n;i++)
		g[i]=sc.nextInt();
	
	int l=0;
	int r=m-1;
	int count=0;
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<m;j++)
		{
			if(b[i]>g[j])
			{
			count++;
			break;
			}
			
		}
	}
	if(n<m)
	{
		System.out.println("no");
	}
	if(count==m)
	{
		System.out.print("yes");
	}
	else
	{
		System.out.println("no");
	}
}
	}

}

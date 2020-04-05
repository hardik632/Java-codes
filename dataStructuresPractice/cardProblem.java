package dataStructures;

import java.util.Scanner;

public class cardProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int m=sc.nextInt();
		int []b=new int[m];
		for(int i=0;i<m;i++)
			b[i]=sc.nextInt();
		int max=0;
		for(int i=0;i<m;i++)
		{
			if(b[i]>max)
				max=b[i];
		}
		 int x=0;
			 
		for(int i=0;i<n;i++)
		{
			
		for(int j=0;j<m;j++)
			
		{
			if(a[i]<b[j])
			{
				x+=max-a[i]+1;
				break;
			}
			
		}
		}
		System.out.println(x);
			

	}

}

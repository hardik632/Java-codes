package dataStructures;

import java.util.Scanner;

public class LinearSearchPractice {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		/*String s=new String();
		s=sc.next();
		int count=0;
		for(int i=0;i<n-3;i++)
		{
		
		if(s.charAt(i)==s.charAt(i+2))
		{
			count++;
		}
		}
		System.out.println(count);
		*/
		
		int n=sc.nextInt();
		int t=sc.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		while(t--!=0)
		{
			int i;
			int p1=-1;
		int v=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==v)
				p1=i;
		}
		if(p1==-1)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
		}
		
	}
			
	}

package dataStructures;

import java.util.Scanner;

public class deletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of elements:");
		int n=sc.nextInt();
		int position=0;
		int[] a=new int[n];

		System.out.println("enter "+n+" elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the element you want to search:");
		int m=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==m)
			{
			position=i;	
			}
		}
		

	}

}

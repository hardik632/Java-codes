package dataStructures;

import java.util.Scanner;

public class reversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int start=0;
		int n=sc.nextInt();
		int[] a=new int[n];
		int end=n-1;
		int c;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		while(start<end)
		{
			c=a[start];
			a[start]=a[end];
			a[end]=c;
		
		start++;
		end--;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}

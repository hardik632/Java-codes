package dataStructures;

import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("before sorting: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		int temp;
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
		System.out.println();
		System.out.print("after  sorting: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}

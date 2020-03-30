package dataStructures;

import java.util.Scanner;

public class quickSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		quickSort obj=new quickSort();
		obj.quickSorting(a,0,n-1);
		for(int i: a)
		{
			System.out.print(i+" ");
		}
	}

	void quickSorting(int[] a, int l, int r) {
		// TODO Auto-generated method stub
		if(l<r)
		{
			int p=partion(a,l,r);
			quickSorting(a,l,p-1);
			quickSorting(a,p,r);
		}
		
	}

	 int partion(int[] a, int l, int r) {
		// TODO Auto-generated method stub
		 int pivot=a[r];
		 int i=l-1;
		 for(int j=l;j<r;j++)
		 {
			 if(a[j]>pivot)
			 {
				i++; 
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			 }	 
		 }
		 int temp = a[i+1];
		 a[i+1]=a[r];
		 a[r]=temp;
		return i+1;
	}
}
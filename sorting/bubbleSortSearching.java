package dataStructures;

import java.util.Scanner;

public class bubbleSortSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of elements: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elements in array: ");
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
		System.out.println();
		System.out.print("enter the value to search: ");
		int value=sc.nextInt();
		int end=n-1;
		int beg=0;
		int mid;
		int pos=-1;
		while(beg<=end)
		{
			mid=(beg+end)/2;
			if(a[mid]==value)
			{
				pos=mid;
				break;
			}
			else if(a[mid]>value)
			{
				end=mid-1;
			}
			else
			{
				beg=mid+1;
			}
		}
		if(pos==-1)
		{
			System.out.println("not present");
		}
		else
		{
			System.out.println("element is found at: "+pos);
		}


	}

}

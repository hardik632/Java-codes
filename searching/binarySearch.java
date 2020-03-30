package dataStructures;
import java.util.*;
public class binarySearch {

	private static Scanner sc;
	

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		System.out.print(a[i]+" ");
		}
		
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
/*
10
16
19
20
23
45
56
78
90
96
100
*/
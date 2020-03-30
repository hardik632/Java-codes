package dataStructures;
import java.util.*;
public class binarySearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
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
		binarySearchRecursive b=new binarySearchRecursive();
		System.out.print(b.search(a,value,end,beg));
	}

	int search(int[] a, int value, int end, int beg) {
		// TODO Auto-generated method stub
		int mid=(end+beg)/2;
		if(mid-1<beg)
			return -1;
			if(value==a[mid])
			return mid;
		else if(value<a[mid])
			return search(a,value,beg,mid-1);
		return search(a,value,mid+1,end);
	}

}

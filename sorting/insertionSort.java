package dataStructures;
import java.util.*;
public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int j=0;
		int temp=0;
		
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("before insertion sort: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(int i=1;i<n;i++)
		{
			temp=a[i];
			j=i-1;
			while(j>=0 && temp<a[j])
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=temp;
			
		}
		System.out.println();
		System.out.println("after insertion sort: ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");

	}

}

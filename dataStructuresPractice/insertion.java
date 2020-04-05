package dataStructures;
import java.util.*;
public class insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements: ");
		int n=sc.nextInt();
		int[] a =new int[n];
		System.out.println("enter the elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the index: ");
		int index=sc.nextInt();
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		System.out.println("elements are: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i = (n-1); i >= (index-1); i--)
            a[i] = a[i-1];
        	a[index-1] = num;
        	System.out.println();
		System.out.println("elements after inserting are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}

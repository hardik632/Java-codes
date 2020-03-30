package dataStructures;
import java.util.Scanner;
public class sorting{

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int temp=0;
		System.out.print("enter the number of elements: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println();
		System.out.print("elements are: ");
		for(int i=0;i<n;i++)
		{
			
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("elements in ascending order: ");
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
		for(int i=0;i<n;i++)
		{
			
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("elements in descending order: ");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		for(int i=0;i<n;i++)
		{
			
			System.out.print(a[i]+" ");
		}

	}

}

package dataStructures;

import java.util.Scanner;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		selectionSort(a,n);
	}
	public static void selectionSort(int[] a,int n)
	{
		int temp;
		for (int i = 0; i < n; i++) 
        {
            int min = i; 
            for (int j = i+1; j < n; j++) 
            {
                if (a[j] < a[min]) 
                	
                    min = j; 
            }
            temp = a[min]; 
            a[min] = a[i]; 
            a[i] = temp; 
        } 

		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

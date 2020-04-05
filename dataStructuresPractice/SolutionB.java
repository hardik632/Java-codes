package dataStructures;

import java.util.Scanner;

public class SolutionB {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//numbers of elements in an array
		int value=sc.nextInt();// value to be searched
		int[] a=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			a[i]=sc.nextInt();//elements in an array
		}
		SolutionB obj=new SolutionB();
		
		int pos=obj.search(a,0,a.length-1,value);//position to store the index of element at which index=value;
		
		if(pos==-1)//element not found
		{
			System.out.print("NOT_FOUND");
		}
		else
		{
			System.out.print(pos);
		}
		
	}

	public int search(int[] a,int start,int end,int value) {
		
		int index=0;
		
		try 
		{
				
			int middle=(start+end)/2; // find the middle element of an array
			if(end<=start)
			{
				return -1;// index not found
			}
			
			else if(a[middle]==value)
			{
				return middle; // if value is found at middle index return middle
			}
			
			else if(a[middle]>value)
			{
				return search(a,start,middle,value); // if value is smaller then middle index
			}
			
			else
			{
				return search(a,middle+1,end,value);// if value is greater then middle index
			}
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			return search(a,start,end,value);
		}
	}

}

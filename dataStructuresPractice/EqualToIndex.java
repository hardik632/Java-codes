package dataStructures;
import java.util.*;
public class EqualToIndex {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pos=-1;
		int[] a=new int[100];
		for(int i=1;i<=n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=1;i<=n;i++)
		{
			if(a[i]==i)
			{
				pos=i;
				break;
			}
		}
		if(pos!=-1)
		{
			System.out.println(pos);
		}
		
		else
		{
			System.out.println("NOT_FOUND");
		}
	}
}
package dataStructures;
import java.util.*;

public class binarySearchJavaAssignment {

		public void check(int[] a,int beg,int end,int value)
		{
			int pos=-1;
			int mid=0;
			while(end>=beg)
			{
				mid=(beg+end)/2;
				if(value==a[mid])
				{
					pos=mid;
					break;
				}
				else if(value<a[mid])
				{
					end=mid-1;
				}
				else if(value>a[mid])
				{
					beg=mid+1;
				}
			}

			if(pos==-1)
			{
				System.out.println("NOT_FOUND");
			}
			else
			{
				System.out.println(pos);
			}
			
		}

		public static void main(String[] args) {
			
			binarySearchJavaAssignment obj=new binarySearchJavaAssignment();
			
			Scanner sc=new Scanner(System.in);
			
			int n=sc.nextInt();
			int value=sc.nextInt();
			
			int[] a=new int[100];
			a[0]=-1;
			for(int i=0;i<n;i++) {
				a[i+1]=sc.nextInt();
			}
			
			int beg=1;
			int end=n;
			obj.check(a,beg,end,value);

		}

	}

import java.util.*;
public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(5);
		a.add(2);
		//removeduplicate(a);
	}
		private static void removeduplicate(ArrayList<Integer> a) {
		// TODO Auto-generated method stub
			HashSet<Integer> h=new HashSet<Integer>();
			for(int i=0;i<a.size();i++)
			{
				if(h.contains(a.get(i)))
				{
					h.remove(a.get(i));
					i--;
				}
				else
				{
					h.add(a.get(i));
				}
			}
			a=new ArrayList<Integer>(h);
			for(int i=0;i<a.size();i++)
				System.out.print(a.get(i)+" ");
		}
//		for(int i : h)
//		{
//			System.out.print(i+" ");
//		}
//		for(int i=0;i<n-1;i++)
//		{
//			if(a[i]!=a[i+1])
//				temp[j++]=a[i];
//		}
//		temp[j++]=a[n-1];
//		for(int i=0;i<j;i++)
//			a[i]=temp[i];
//		
//		
//		for(int i=0;i<j;i++)
//		{
//			System.out.print(a[i]+" ");
//		}
		// Java program to count increasing 
		// subsequences in an array of digits. 
}
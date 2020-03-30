import java.util.Scanner;

public class quicksort {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		quicksort obj=new quicksort();
		obj.sorted(n,a,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	private void sorted(int n, int[] a,int l,int r) {
		if(l<r)
		{
			int p=partion(n,a,l,r);
			sorted(n,a,l,p-1);
			sorted(n,a,p,r);
					
		}
		// TODO Auto-generated method stub
		
	}
	private int partion(int n, int[] a, int l, int r) {
		// TODO Auto-generated method stub
		 int pivot=a[r];
		 int i=l-1;
		 for(int j=l;j<r;j++)
		 {
			 if(a[j]<pivot)
			 {
				i++; 
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			 }	 
		 }
		 int temp = a[i+1];
		 a[i+1]=a[r];
		 a[r]=temp;
		return i+1;
	}


}

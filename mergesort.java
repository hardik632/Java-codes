import java.util.Scanner;

public class mergesort {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		mergesort obj=new mergesort();
		obj.sorted(n,a,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	private void sorted(int n, int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int m=0;
		if(i<j)
		{
			m=(i+j)/2;
			sorted(n,a,i,m);
			sorted(n,a,m+1,j);
			merge(n,a,m,i,j);
		}
		
		
	}

	 void merge(int n, int[] a, int m, int l, int r) {
		// TODO Auto-generated method stub
		int[] mergearray=new int[a.length];
		for(int i=0;i<n;i++)
		{
			mergearray[i]=a[i];
		}
		int i=l;
		int j=m+1;
		int k=l;
		while(i<=m&&j<=r)
		{
			if(mergearray[i]<=mergearray[j])
			{
				a[k]=mergearray[i];
				i++;
			}
			else
			{
				a[k]=mergearray[j];
				j++;
			}
			k++;
		}
		while(i<=m)
		{
			a[k]=mergearray[i];
			k++;
			i++;
		}

}
}

package dataStructures;

public class mergesort1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {23,12,45,87,36,95,15};
		int n=a.length;
		int l=0;
		int r=n-1;
		new mergesort1().sorted(a,l,r);
		for(int i=0;i<n;i++)
		{	
			System.out.print(a[i]+" ");
		}
	}

	public void sorted(int[] a, int l, int r) {
		// TODO Auto-generated method stub
		if(l<r)
		{
			int m=(l+r)/2;
			sorted(a,l,m);
			sorted(a,m+1,r);
			mergesortarray(a,l,m,r);
			
		}
		
	}

	void mergesortarray(int[] a, int l, int m, int r) {
		// TODO Auto-generated method stub
		int[] mergearray=new int[a.length];
		int n=a.length;
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

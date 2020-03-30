package dataStructures;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {38,27,43,3,9,82,10};
		int n=a.length;
		int l=0;
		int r=n-1;
		
		mergeSort obj=new mergeSort();
		obj.sorting(a,l,r);
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	
	void sorting(int[]a,int l,int r)
	{
		int m=0;
			if(r>l)
			{
				m=(l+r)/2;
				sorting(a,l,m);
				sorting(a,m+1,r);
				merge(a,l,m,r);
			}			
	}	
	
		
	
	void merge(int []a,int l,int m,int r)
	{
		int l1=m+1-l;
		int r1=r-m;
		int[] left=new int[l1];
		int[] right=new int[r1];
		int k = 0;
		for(int i=0;i<l1;i++)
		{
			left[i]=a[i+l];
		}
		for(int i=0;i<r1;i++)
		{
			right[i]=a[m+1+i];
		}
		int i=0;
		int j=0;
		k=l;
		/*int temp;
		for(i=0;i<l1;i++)
		{
			for(j=i+1;j<l1;j++)
			{
				if(left[i]>left[j])
				{
					temp=left[i];
					left[i]=left[j];
					left[j]=temp;
				}
			}
		}
		for(i=0;i<r1;i++)
		{
			for(j=i+1;j<r1;j++)
			{
				if(right[i]>right[j])
				{
					temp=right[i];
					right[i]=right[j];
					right[j]=temp;
				}
			}
			
		}
		for(i=0;i<l1;i++)
		{
		a[k++]=left[i];	
		}
		for(i=0;i<r1;i++)
		{
		a[k++]=right[i];	
		}
		
		for(i=0;i<k;i++)
		{
			for(j=i+1;j<k;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		*/
		
		while(i<l1 && j<r1)
		{
			if(left[i]<=right[j])
			{
				a[k]=left[i];
				i++;
			}
			else
			{
				a[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<l1)
		{
			a[k]=left[i];
			k++;
			i++;
		}
		while(i<r1)
		{
			a[k]=right[i];
			k++;
			i++;
		}
		
	}

}

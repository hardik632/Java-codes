package dataStructures;

public class practiceMergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int k=6;
		int a[]=new int[] {12,18,17,65,46};

	int modi=0;
	int modj=0;
	for(int i=0;i<n-1;i++)
	{
		for(int j=i;j>=0;j--)
		{
			modi=a[j]%k;
			modj=a[j+1]%k;
			if(modi>modj)
			{
				int temp;
				
				temp=a[i];
				a[j]=a[j];
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


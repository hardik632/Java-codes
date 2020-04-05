package dataStructures;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=1;
		int n=5;
		int[] a=new int[] {1,2,3,4,5};
		int b=1;
		int sum=0;
		int sum2=0;
		while(t--!=0)
		{
			int min=n-b;
			for(int i=0;i<n-min;i++) {
				sum=sum+a[i];
			}
			for(int i=min;i<n;i++)
			{
				sum2=sum2+a[i];
			}
			System.out.println(Math.abs(sum-sum2));
		}
				
		}
	}

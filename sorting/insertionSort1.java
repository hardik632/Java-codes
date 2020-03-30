package dataStructures;

	public class insertionSort1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int j=0;
			int temp=0;
			  
			int[] a=new int[] {1,2,3,4,5,6,7,8,9,10};
			int n=a.length;
			for(int i=1;i<n;i++)
			{
				temp=a[i];
				j=i-1;
				while(j>=0 && temp>a[j])
				{
					a[j+1]=a[j];
					j=j-1;				
				}
				a[j+1]=temp;
				
				for(int i1=0;i1<n;i1++)
					System.out.print(a[i1]+" ");
				
				System.out.println();
			}
	
		
		}
		}
